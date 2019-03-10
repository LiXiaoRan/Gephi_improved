/*
Copyright 2008-2010 Gephi
Authors : Yi Du <duyi001@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
 */
package org.gephi.desktop.importer;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.gephi.io.importer.spi.ImporterWizardUI;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

public final class WizardVisualPanel1 extends JPanel implements ChangeListener {

    private final DefaultListModel subTypeModel = new DefaultListModel();

    public WizardVisualPanel1() {
        initComponents();
        reloadDescription();
    }

    @Override
    public String getName() {
        return NbBundle.getMessage(WizardVisualPanel1.class, "WizardVisualPanel1.title");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCategory = new javax.swing.JLabel();
        labelWizard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        wizardList = new javax.swing.JList();
        labelDescription = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(500, 360));
        setPreferredSize(new java.awt.Dimension(500, 360));

        org.openide.awt.Mnemonics.setLocalizedText(labelCategory, org.openide.util.NbBundle.getMessage(WizardVisualPanel1.class, "WizardVisualPanel1.labelCategory.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelWizard, org.openide.util.NbBundle.getMessage(WizardVisualPanel1.class, "WizardVisualPanel1.labelWizard.text")); // NOI18N

        categoryList.setModel(getCategoryListModel());
        categoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        categoryList.setSelectedIndex(0);
        categoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                categoryListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(categoryList);

        wizardList.setModel(reloadSubType());
        wizardList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        wizardList.setSelectedIndex(0);
        wizardList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                wizardListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(wizardList);

        org.openide.awt.Mnemonics.setLocalizedText(labelDescription, org.openide.util.NbBundle.getMessage(WizardVisualPanel1.class, "WizardVisualPanel1.labelDescription.text")); // NOI18N

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane3.setViewportView(descriptionArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelWizard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(labelDescription))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategory)
                    .addComponent(labelWizard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_categoryListValueChanged
        reloadSubType();
        if (wizardList.getSelectedValue() == null) {
            descriptionArea.setText("");
        }
        wizardList.setSelectedIndex(0);
    }//GEN-LAST:event_categoryListValueChanged

    private void wizardListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wizardListValueChanged
        reloadDescription();
    }//GEN-LAST:event_wizardListValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList categoryList;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelWizard;
    private javax.swing.JList wizardList;
    // End of variables declaration//GEN-END:variables

    public String getCurrentCategory() {
        return categoryList.getSelectedValue().toString();
    }

    public String getCurrentWizard() {
        return wizardList.getSelectedValue().toString();
    }

    private ListModel getCategoryListModel() {
        DefaultListModel model = new DefaultListModel();
        for (ImporterWizardUI wizardUi : Lookup.getDefault().lookupAll(ImporterWizardUI.class)) {
            if (!model.contains(wizardUi.getCategory())) {
                model.addElement(wizardUi.getCategory());
            }
        }
        return model;
    }

    private ListModel reloadSubType() {
        subTypeModel.clear();
        if (categoryList.getSelectedValue() == null) {
            return subTypeModel;
        }
        String category = categoryList.getSelectedValue().toString();

        for (ImporterWizardUI wizardUi : Lookup.getDefault().lookupAll(ImporterWizardUI.class)) {
            if (category.equals(wizardUi.getCategory())) {
                subTypeModel.addElement(wizardUi.getDisplayName());
                descriptionArea.setText(wizardUi.getDescription());
            }
        }
        return subTypeModel;
    }

    private void reloadDescription() {
        String description = "";
        if (emptyList()) {
            description = NbBundle.getMessage(WizardPanel1.class, "ImportWizard.description_no_plugin_importers_installed");
        } else {
            String category = categoryList.getSelectedValue().toString();
            String wizard = wizardList.getSelectedValue().toString();

            for (ImporterWizardUI wizardUi : Lookup.getDefault().lookupAll(ImporterWizardUI.class)) {
                if (category.equals(wizardUi.getCategory()) && wizard.equals(wizardUi.getDisplayName())) {
                    description = wizardUi.getDescription();
                    break;
                }
            }
        }

        descriptionArea.setText(description);
    }

    boolean emptyList() {
        return categoryList.getSelectedValue() == null
                || wizardList.getSelectedValue() == null;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
