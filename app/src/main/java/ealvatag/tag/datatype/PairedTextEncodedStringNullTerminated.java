package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1376e;
import defpackage.C10754e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class PairedTextEncodedStringNullTerminated extends AbstractDataType {

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    /* loaded from: classes3.dex */
    public static class ValuePairs {
        private List<Pair> mapping = new ArrayList();

        public void add(Pair pair) {
            this.mapping.add(pair);
        }

        public void add(String str, String str2) {
            this.mapping.add(new Pair(str, str2));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ValuePairs) && ((long) getNumberOfValues()) == ((long) ((ValuePairs) obj).getNumberOfValues());
        }

        public List<Pair> getMapping() {
            return this.mapping;
        }

        public int getNumberOfPairs() {
            return this.mapping.size();
        }

        public int getNumberOfValues() {
            return this.mapping.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Pair pair : this.mapping) {
                sb.append(pair.getKey());
                sb.append(':');
                sb.append(pair.getValue());
                sb.append(',');
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }
    }

    public PairedTextEncodedStringNullTerminated(PairedTextEncodedStringNullTerminated pairedTextEncodedStringNullTerminated) {
        super(pairedTextEncodedStringNullTerminated);
    }

    public PairedTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
        this.value = new ValuePairs();
    }

    public PairedTextEncodedStringNullTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.value = new ValuePairs();
    }

    public boolean canBeEncoded() {
        Object obj = this.value;
        if (obj == null) {
            InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i = C1724e.ad;
            return false;
        }
        Iterator it = ((ValuePairs) obj).mapping.iterator();
        while (it.hasNext()) {
            if (!new TextEncodedStringNullTerminated(this.identifier, this.frameBody, ((Pair) it.next()).getValue()).canBeEncoded()) {
                return false;
            }
        }
        return true;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PairedTextEncodedStringNullTerminated) {
            return AbstractC1376e.vip(this.value, ((PairedTextEncodedStringNullTerminated) obj).value);
        }
        return false;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public ValuePairs getValue() {
        return (ValuePairs) this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        int i2 = i;
        while (i2 > 0) {
            TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
            textEncodedStringNullTerminated.read(c16151e, i2);
            int size = textEncodedStringNullTerminated.getSize();
            if (size == 0) {
                break;
            }
            this.size += size;
            int i3 = i2 - size;
            try {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                textEncodedStringNullTerminated2.read(c16151e.clone(), i);
                int size2 = textEncodedStringNullTerminated2.getSize();
                c16151e.skip(size2);
                this.size += size2;
                i2 = i3 - size2;
                if (size2 == 0) {
                    break;
                }
                ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringNullTerminated2.getValue());
                if (this.size == 0) {
                    InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                    ((C7936e) interfaceC4279e).getClass();
                    int i4 = C1724e.ad;
                    throw new Exception("No null terminated Strings found");
                }
            } catch (C10754e unused) {
                TextEncodedStringSizeTerminated textEncodedStringSizeTerminated = new TextEncodedStringSizeTerminated(this.identifier, this.frameBody);
                textEncodedStringSizeTerminated.read(c16151e, i);
                int size3 = textEncodedStringSizeTerminated.getSize();
                this.size += size3;
                if (size3 != 0) {
                    ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringSizeTerminated.getValue());
                }
            }
        }
        InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e2).getClass();
        int i5 = C1724e.ad;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        do {
            try {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                textEncodedStringNullTerminated.readByteArray(bArr, i);
                this.size += textEncodedStringNullTerminated.getSize();
                i += textEncodedStringNullTerminated.getSize();
                if (textEncodedStringNullTerminated.getSize() != 0) {
                    try {
                        TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                        textEncodedStringNullTerminated2.readByteArray(bArr, i);
                        this.size += textEncodedStringNullTerminated2.getSize();
                        i += textEncodedStringNullTerminated2.getSize();
                        if (textEncodedStringNullTerminated2.getSize() != 0) {
                            ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringNullTerminated2.getValue());
                        }
                    } catch (C10754e unused) {
                        if (i < bArr.length) {
                            TextEncodedStringSizeTerminated textEncodedStringSizeTerminated = new TextEncodedStringSizeTerminated(this.identifier, this.frameBody);
                            textEncodedStringSizeTerminated.readByteArray(bArr, i);
                            this.size += textEncodedStringSizeTerminated.getSize();
                            textEncodedStringSizeTerminated.getSize();
                            if (textEncodedStringSizeTerminated.getSize() != 0) {
                                ((ValuePairs) this.value).add((String) textEncodedStringNullTerminated.getValue(), (String) textEncodedStringSizeTerminated.getValue());
                            }
                        }
                    }
                }
            } catch (C10754e unused2) {
            }
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
            int i3 = C1724e.ad;
            return;
        } while (this.size != 0);
        InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e3).getClass();
        int i4 = C1724e.ad;
        throw new Exception("No null terminated Strings found");
    }

    public String toString() {
        return this.value.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int i2 = 0;
            for (Pair pair : ((ValuePairs) this.value).mapping) {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, pair.getKey());
                byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
                int size = i2 + textEncodedStringNullTerminated.getSize();
                TextEncodedStringNullTerminated textEncodedStringNullTerminated2 = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, pair.getValue());
                byteArrayOutputStream.write(textEncodedStringNullTerminated2.writeByteArray());
                i2 = size + textEncodedStringNullTerminated2.getSize();
            }
            this.size = i2;
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
            int i3 = C1724e.ad;
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e3).getClass();
            int i4 = C1724e.ad;
            throw new RuntimeException(e);
        }
    }
}
