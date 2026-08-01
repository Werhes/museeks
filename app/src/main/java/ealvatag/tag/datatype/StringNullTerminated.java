package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class StringNullTerminated extends TextEncodedStringNullTerminated {
    public StringNullTerminated(StringNullTerminated stringNullTerminated) {
        super(stringNullTerminated);
    }

    public StringNullTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    @Override // ealvatag.tag.datatype.TextEncodedStringNullTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringNullTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public Charset getTextEncodingCharSet() {
        return AbstractC4639e.vip;
    }
}
