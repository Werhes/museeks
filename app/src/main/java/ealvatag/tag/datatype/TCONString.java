package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class TCONString extends TextEncodedStringSizeTerminated {
    private boolean isNullSeparateMultipleValues;

    public TCONString(TCONString tCONString) {
        super(tCONString);
        this.isNullSeparateMultipleValues = true;
    }

    public TCONString(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.isNullSeparateMultipleValues = true;
    }

    private static List<String> splitV23(String str) {
        List<String> asList = Arrays.asList(str.replaceAll("(\\(\\d+\\)|\\(RX\\)|\\(CR\\)\\w*)", "$1\u0000").split("\u0000"));
        if (asList.size() != 0) {
            return asList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(BuildConfig.FLAVOR);
        return arrayList;
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public void addValue(String str) {
        if (isNullSeparateMultipleValues()) {
            setValue(this.value + "\u0000" + str);
            return;
        }
        if (str.startsWith("(")) {
            setValue(this.value + str);
            return;
        }
        setValue(this.value + "\u0000" + str);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TCONString) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public int getNumberOfValues() {
        return getValues().size();
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public String getValueAtIndex(int i) {
        return getValues().get(i);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public String getValueWithoutTrailingNull() {
        List<String> values = getValues();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i != 0) {
                sb.append("\u0000");
            }
            sb.append(values.get(i));
        }
        return sb.toString();
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringSizeTerminated
    public List<String> getValues() {
        return this.value != null ? isNullSeparateMultipleValues() ? TextEncodedStringSizeTerminated.splitByNullSeperator((String) this.value) : splitV23((String) this.value) : Collections.EMPTY_LIST;
    }

    public boolean isNullSeparateMultipleValues() {
        return this.isNullSeparateMultipleValues;
    }

    public void setNullSeparateMultipleValues(boolean z) {
        this.isNullSeparateMultipleValues = z;
    }
}
