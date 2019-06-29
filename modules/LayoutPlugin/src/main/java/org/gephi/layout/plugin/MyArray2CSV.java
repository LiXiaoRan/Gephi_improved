/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gephi.layout.plugin;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Lee Ran
 */
public class MyArray2CSV {
    //导出到csv文件
    private static String FileAbstractPathString="E:\\IWork\\GPU-accelerate\\builds\\linux\\gephiResult_csv\\";//绝对路径
      public static void Array2CSV(ArrayList<ArrayList<String>> data, String path)
      {
          try {
                BufferedWriter out =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileAbstractPathString+path),"UTF-8"));         
                for (int i = 0; i < data.size(); i++)
                {
                    ArrayList<String> onerow=data.get(i);
                    for (int j = 0; j < onerow.size(); j++)
                    {
                        out.write(DelQuota(onerow.get(j)));
                        out.write(",");
                    }
                    out.newLine();
                }
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

      }
      public static String DelQuota(String str)
      {
          String result = str;
          String[] strQuota = { "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "`", ";", "'", ",", ".", "/", ":", "/,", "<", ">", "?" };
          for (int i = 0; i < strQuota.length; i++)
          {
              if (result.indexOf(strQuota[i]) > -1)
                  result = result.replace(strQuota[i], "");
          }
          return result;
      }
}
