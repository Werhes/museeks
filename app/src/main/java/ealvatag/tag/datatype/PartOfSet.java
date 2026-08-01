package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1376e;
import defpackage.AbstractC4639e;
import defpackage.C12927e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C4117e;
import defpackage.C7936e;
import defpackage.EnumC0734e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class PartOfSet extends AbstractString {

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    /* loaded from: classes3.dex */
    public static class PartOfSetValue {
        private static final String SEPARATOR = "/";
        private Integer count;
        private String extra;
        private String rawCount;
        private String rawText;
        private String rawTotal;
        private Integer total;
        private static final Pattern trackNoPatternWithTotalCount = Pattern.compile("([0-9]+)/([0-9]+)(.*)", 2);
        private static final Pattern trackNoPattern = Pattern.compile("([0-9]+)(.*)", 2);

        public PartOfSetValue() {
            this.rawText = BuildConfig.FLAVOR;
        }

        public PartOfSetValue(Integer num, Integer num2) {
            this.count = num;
            this.rawCount = num.toString();
            this.total = num2;
            this.rawTotal = num2.toString();
            resetValueFromCounts();
        }

        public PartOfSetValue(String str) {
            this.rawText = str;
            initFromValue(str);
        }

        private void initFromValue(String str) {
            try {
                Matcher matcher = trackNoPatternWithTotalCount.matcher(str);
                if (matcher.matches()) {
                    this.extra = matcher.group(3);
                    this.count = Integer.valueOf(Integer.parseInt(matcher.group(1)));
                    this.rawCount = matcher.group(1);
                    this.total = Integer.valueOf(Integer.parseInt(matcher.group(2)));
                    this.rawTotal = matcher.group(2);
                    return;
                }
                Matcher matcher2 = trackNoPattern.matcher(str);
                if (matcher2.matches()) {
                    this.extra = matcher2.group(2);
                    this.count = Integer.valueOf(Integer.parseInt(matcher2.group(1)));
                    this.rawCount = matcher2.group(1);
                }
            } catch (NumberFormatException unused) {
                this.count = 0;
            }
        }

        private void padNumber(StringBuilder sb, Integer num, EnumC0734e enumC0734e) {
            if (num != null) {
                if (enumC0734e == EnumC0734e.f3030e) {
                    if (num.intValue() <= 0 || num.intValue() >= 10) {
                        sb.append(num.intValue());
                        return;
                    } else {
                        sb.append("0");
                        sb.append(num);
                        return;
                    }
                }
                if (enumC0734e == EnumC0734e.f3028e) {
                    if (num.intValue() > 0 && num.intValue() < 10) {
                        sb.append("00");
                        sb.append(num);
                        return;
                    } else if (num.intValue() <= 9 || num.intValue() >= 100) {
                        sb.append(num.intValue());
                        return;
                    } else {
                        sb.append("0");
                        sb.append(num);
                        return;
                    }
                }
                if (enumC0734e == EnumC0734e.f3027e) {
                    if (num.intValue() > 0 && num.intValue() < 10) {
                        sb.append("000");
                        sb.append(num);
                        return;
                    }
                    if (num.intValue() > 9 && num.intValue() < 100) {
                        sb.append("00");
                        sb.append(num);
                    } else if (num.intValue() <= 99 || num.intValue() >= 1000) {
                        sb.append(num.intValue());
                    } else {
                        sb.append("0");
                        sb.append(num);
                    }
                }
            }
        }

        private void resetValueFromCounts() {
            StringBuilder sb = new StringBuilder();
            String str = this.rawCount;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0");
            }
            if (this.rawTotal != null) {
                sb.append(SEPARATOR);
                sb.append(this.rawTotal);
            }
            String str2 = this.extra;
            if (str2 != null) {
                sb.append(str2);
            }
            this.rawText = sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PartOfSetValue)) {
                return false;
            }
            PartOfSetValue partOfSetValue = (PartOfSetValue) obj;
            return AbstractC1376e.vip(getCount(), partOfSetValue.getCount()) && AbstractC1376e.vip(getTotal(), partOfSetValue.getTotal());
        }

        public Integer getCount() {
            return this.count;
        }

        public String getCountAsText() {
            C12927e.license();
            return this.rawCount;
        }

        public String getRawValue() {
            return this.rawText;
        }

        public Integer getTotal() {
            return this.total;
        }

        public String getTotalAsText() {
            C12927e.license();
            return this.rawTotal;
        }

        public void setCount(Integer num) {
            this.count = num;
            this.rawCount = num.toString();
            resetValueFromCounts();
        }

        public void setCount(String str) {
            try {
                this.count = Integer.valueOf(Integer.parseInt(str));
                this.rawCount = str;
                resetValueFromCounts();
            } catch (NumberFormatException unused) {
            }
        }

        public void setRawValue(String str) {
            this.rawText = str;
            initFromValue(str);
        }

        public void setTotal(Integer num) {
            this.total = num;
            this.rawTotal = num.toString();
            resetValueFromCounts();
        }

        public void setTotal(String str) {
            try {
                this.total = Integer.valueOf(Integer.parseInt(str));
                this.rawTotal = str;
                resetValueFromCounts();
            } catch (NumberFormatException unused) {
            }
        }

        public String toString() {
            C12927e.license();
            return this.rawText;
        }
    }

    public PartOfSet(PartOfSet partOfSet) {
        super(partOfSet);
    }

    public PartOfSet(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PartOfSet) {
            return AbstractC1376e.vip(this.value, ((PartOfSet) obj).value);
        }
        return false;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public PartOfSetValue getValue() {
        return (PartOfSetValue) this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        try {
            PartOfSetValue partOfSetValue = new PartOfSetValue(c16151e.mo1683e(i, getTextEncodingCharSet()));
            this.value = partOfSetValue;
            setSize(partOfSetValue.toString().length());
        } catch (C4117e e) {
            throw new Exception("Bad charset Id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        CharsetDecoder newDecoder = getTextEncodingCharSet().newDecoder();
        ByteBuffer slice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        CharBuffer allocate = CharBuffer.allocate(bArr.length - i);
        newDecoder.reset();
        if (newDecoder.decode(slice, allocate, true).isError()) {
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
        }
        newDecoder.flush(allocate);
        allocate.flip();
        this.value = new PartOfSetValue(allocate.toString());
        setSize(bArr.length - i);
        InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e3).getClass();
    }

    @Override // ealvatag.tag.datatype.AbstractString
    public String toString() {
        Object obj = this.value;
        return obj == null ? BuildConfig.FLAVOR : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        CharsetEncoder newEncoder;
        String partOfSetValue = getValue().toString();
        try {
            if (C12927e.license().smaato && partOfSetValue.length() > 0 && partOfSetValue.charAt(partOfSetValue.length() - 1) == 0) {
                partOfSetValue = partOfSetValue.substring(0, partOfSetValue.length() - 1);
            }
            Charset textEncodingCharSet = getTextEncodingCharSet();
            if (AbstractC4639e.purchase.equals(textEncodingCharSet)) {
                newEncoder = AbstractC4639e.appmetrica.newEncoder();
                partOfSetValue = "\ufeff" + partOfSetValue;
            } else {
                newEncoder = textEncodingCharSet.newEncoder();
            }
            CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
            newEncoder.onMalformedInput(codingErrorAction);
            newEncoder.onUnmappableCharacter(codingErrorAction);
            ByteBuffer encode = newEncoder.encode(CharBuffer.wrap(partOfSetValue));
            int limit = encode.limit();
            byte[] bArr = new byte[limit];
            encode.get(bArr, 0, encode.limit());
            setSize(limit);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i = C1724e.ad;
            throw new RuntimeException(e);
        }
    }
}
