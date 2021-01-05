package com.werth;

import java.util.UUID;

public class XTree {

        private final UUID treeID;
        private Integer treeAge;
        private final String treeType;
        private Boolean treeInGoodHealth;

        public XTree(Integer treeAge, String treeType, Boolean treeInGoodHealth) {
            this.treeID = setSingleTreeID();
            this.treeAge = treeAge;
            this.treeType = treeType;
            this.treeInGoodHealth = treeInGoodHealth;
        }

        public String returnAllTreeInfo() {
            return "Tree ID: " + treeID + "\nType: " + getTreeType() + "\nAge: " + getTreeAge() + "\nIn Good Health: " + getTreeInGoodHealth() + "\n";
        }

        public static UUID setSingleTreeID() {
            return UUID.randomUUID();
        }

        public UUID getTreeID() {
            return treeID;
        }

        public Integer getTreeAge() {
            return treeAge;
        }

        public String getTreeType() {
            return treeType;
        }

        public Boolean getTreeInGoodHealth() {
            return treeInGoodHealth;
        }


}
