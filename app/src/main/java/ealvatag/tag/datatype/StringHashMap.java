package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC13328e;
import defpackage.AbstractC4639e;
import defpackage.C5389e;
import defpackage.InterfaceC3518e;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class StringHashMap extends StringFixedLength {
    private boolean hasEmptyValue;
    private final InterfaceC3518e simpleStringStringMap;

    public StringHashMap(StringHashMap stringHashMap) {
        super(stringHashMap);
        this.hasEmptyValue = false;
        this.hasEmptyValue = stringHashMap.hasEmptyValue;
        this.simpleStringStringMap = stringHashMap.simpleStringStringMap;
    }

    public StringHashMap(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e, i);
        this.hasEmptyValue = false;
        if (!str.equals(DataTypes.OBJ_LANGUAGE)) {
            throw new IllegalArgumentException("Hashmap identifier not defined in this class: ".concat(str));
        }
        this.simpleStringStringMap = C5389e.signatures();
    }

    @Override // ealvatag.tag.datatype.StringFixedLength, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof StringHashMap)) {
            return false;
        }
        StringHashMap stringHashMap = (StringHashMap) obj;
        return this.hasEmptyValue == stringHashMap.hasEmptyValue && AbstractC13328e.metrica(this.simpleStringStringMap, stringHashMap.simpleStringStringMap) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public Charset getTextEncodingCharSet() {
        return AbstractC4639e.vip;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (!(obj instanceof String)) {
            this.value = obj;
        } else if (obj.equals("XXX")) {
            this.value = obj.toString();
        } else {
            this.value = ((String) obj).toLowerCase();
        }
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public String toString() {
        String value;
        Object obj = this.value;
        return (obj == null || (value = this.simpleStringStringMap.getValue(obj.toString())) == null) ? BuildConfig.FLAVOR : value;
    }
}
