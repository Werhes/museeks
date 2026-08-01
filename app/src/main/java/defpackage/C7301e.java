package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7301e extends AbstractC16614e implements InterfaceC1425e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C7936e f14906e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C0409e f14907e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final AbstractC8507e f14908e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f14912e = BuildConfig.FLAVOR;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f14914e = BuildConfig.FLAVOR;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public String f14911e = BuildConfig.FLAVOR;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public String f14913e = BuildConfig.FLAVOR;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public String f14910e = BuildConfig.FLAVOR;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public byte f14909e = -1;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f14906e = new C7936e(2);
        Csuper ad = AbstractC8507e.ad();
        ad.mo3904implements(EnumC8271e.ARTIST, EnumC6324e.f13160e);
        ad.mo3904implements(EnumC8271e.ALBUM, EnumC6324e.f13157e);
        ad.mo3904implements(EnumC8271e.TITLE, EnumC6324e.f13159e);
        ad.mo3904implements(EnumC8271e.YEAR, EnumC6324e.f13155e);
        ad.mo3904implements(EnumC8271e.GENRE, EnumC6324e.f13156e);
        ad.mo3904implements(EnumC8271e.COMMENT, EnumC6324e.f13161e);
        C0409e mopub = ad.mopub(true);
        f14907e = mopub;
        Csuper ad2 = AbstractC8507e.ad();
        ad2.mo3901case(mopub.entrySet());
        ad2.mo3904implements(EnumC8271e.TRACK, EnumC6324e.f13162e);
        f14908e = ad2.adcel();
    }

    public C7301e() {
    }

    public C7301e(C12894e c12894e, String str) {
        FileChannel fileChannel = (FileChannel) c12894e.f25752e;
        this.f31887e = str;
        fileChannel.position(fileChannel.size() - 128);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        fileChannel.read(allocate);
        allocate.flip();
        read(allocate);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC8507e tapsense = tapsense();
        AbstractC5542e.license(enumC8271e, "genericKey");
        EnumC6324e enumC6324e = (EnumC6324e) tapsense.get(enumC8271e);
        if (enumC6324e != null) {
            return new C14189e(enumC6324e.name(), 0, (String) AbstractC5542e.appmetrica(strArr));
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        throw new UnsupportedOperationException("TODO:Not done yet");
    }

    public void ads(RandomAccessFile randomAccessFile) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f14906e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[128];
        signatures(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        byte[] bArr2 = AbstractC16614e.f32566e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        if (C12927e.license().adcel) {
            String admob = AbstractC2251e.admob(30, this.f14913e);
            for (int i2 = 0; i2 < admob.length(); i2++) {
                bArr[i2 + 3] = (byte) admob.charAt(i2);
            }
        }
        if (C12927e.license().billing) {
            String admob2 = AbstractC2251e.admob(30, this.f14914e);
            for (int i3 = 0; i3 < admob2.length(); i3++) {
                bArr[i3 + 33] = (byte) admob2.charAt(i3);
            }
        }
        if (C12927e.license().purchase) {
            String admob3 = AbstractC2251e.admob(30, this.f14912e);
            for (int i4 = 0; i4 < admob3.length(); i4++) {
                bArr[i4 + 63] = (byte) admob3.charAt(i4);
            }
        }
        if (C12927e.license().mopub) {
            String admob4 = AbstractC2251e.admob(4, this.f14910e);
            for (int i5 = 0; i5 < admob4.length(); i5++) {
                bArr[i5 + 93] = (byte) admob4.charAt(i5);
            }
        }
        if (C12927e.license().yandex) {
            String admob5 = AbstractC2251e.admob(30, this.f14911e);
            for (int i6 = 0; i6 < admob5.length(); i6++) {
                bArr[i6 + 97] = (byte) admob5.charAt(i6);
            }
        }
        if (C12927e.license().startapp) {
            bArr[127] = this.f14909e;
        }
        randomAccessFile.write(bArr);
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i7 = C1724e.ad;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        throw new C14803e("COVER_ART", 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public AbstractC12614e amazon() {
        return f14907e.keySet();
    }

    public void applovin(String str) {
        AbstractC5542e.metrica(str);
        this.f14911e = AbstractC2251e.admob(30, str);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        return startapp(enumC8271e);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return isVip(enumC8271e).length() > 0;
    }

    @Override // defpackage.AbstractC16225e
    public boolean equals(Object obj) {
        if (!(obj instanceof C7301e)) {
            return false;
        }
        C7301e c7301e = (C7301e) obj;
        return this.f14912e.equals(c7301e.f14912e) && this.f14914e.equals(c7301e.f14914e) && this.f14911e.equals(c7301e.f14911e) && this.f14909e == c7301e.f14909e && this.f14913e.equals(c7301e.f14913e) && this.f14910e.equals(c7301e.f14910e) && super.equals(obj);
    }

    public String inmobi() {
        return this.f14911e;
    }

    @Override // defpackage.InterfaceC9354e
    public boolean isEmpty() {
        return isVip(EnumC8271e.TITLE).length() <= 0 && this.f14914e.length() <= 0 && this.f14912e.length() <= 0 && isVip(EnumC8271e.GENRE).length() <= 0 && isVip(EnumC8271e.YEAR).length() <= 0 && inmobi().length() <= 0;
    }

    public boolean isPro(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, AbstractC16614e.f32566e);
    }

    public String isVip(EnumC8271e enumC8271e) {
        if (amazon().contains(enumC8271e)) {
            return (String) startapp(enumC8271e).appmetrica(BuildConfig.FLAVOR);
        }
        throw new C14803e(enumC8271e.f16947e, 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public int license() {
        return 6;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        throw new C14803e("COVER_ART", 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public AbstractC17475e metrica(EnumC8271e enumC8271e) {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        smaato(ad(enumC8271e, strArr));
        return this;
    }

    @Override // defpackage.AbstractC11463e
    public void read(ByteBuffer byteBuffer) {
        if (!isPro(byteBuffer)) {
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f31887e, ":ID3v1 tag not found"));
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f14906e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[128];
        byteBuffer.position(0);
        byteBuffer.get(bArr, 0, 128);
        Charset charset = AbstractC4639e.vip;
        String trim = new String(bArr, 3, 30, charset).trim();
        this.f14913e = trim;
        Pattern pattern = AbstractC16614e.f32567e;
        Matcher matcher = pattern.matcher(trim);
        if (matcher.find()) {
            this.f14913e = this.f14913e.substring(0, matcher.start());
        }
        String trim2 = new String(bArr, 33, 30, charset).trim();
        this.f14914e = trim2;
        Matcher matcher2 = pattern.matcher(trim2);
        if (matcher2.find()) {
            this.f14914e = this.f14914e.substring(0, matcher2.start());
        }
        String trim3 = new String(bArr, 63, 30, charset).trim();
        this.f14912e = trim3;
        Matcher matcher3 = pattern.matcher(trim3);
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        if (matcher3.find()) {
            this.f14912e = this.f14912e.substring(0, matcher3.start());
            c7936e.getClass();
        }
        String trim4 = new String(bArr, 93, 4, charset).trim();
        this.f14910e = trim4;
        Matcher matcher4 = pattern.matcher(trim4);
        if (matcher4.find()) {
            this.f14910e = this.f14910e.substring(0, matcher4.start());
        }
        String trim5 = new String(bArr, 97, 30, charset).trim();
        this.f14911e = trim5;
        Matcher matcher5 = pattern.matcher(trim5);
        c7936e.getClass();
        if (matcher5.find()) {
            this.f14911e = this.f14911e.substring(0, matcher5.start());
            c7936e.getClass();
        }
        this.f14909e = bArr[127];
    }

    @Override // defpackage.InterfaceC1425e
    public void smaato(InterfaceC3589e interfaceC3589e) {
        int ordinal = EnumC8271e.valueOf(interfaceC3589e.getId()).ordinal();
        if (ordinal == 2) {
            String interfaceC3589e2 = interfaceC3589e.toString();
            AbstractC5542e.metrica(interfaceC3589e2);
            this.f14912e = AbstractC2251e.admob(30, interfaceC3589e2);
            return;
        }
        if (ordinal == 11) {
            String interfaceC3589e3 = interfaceC3589e.toString();
            AbstractC5542e.metrica(interfaceC3589e3);
            this.f14914e = AbstractC2251e.admob(30, interfaceC3589e3);
            return;
        }
        if (ordinal == 22) {
            applovin(interfaceC3589e.toString());
            return;
        }
        if (ordinal == 43) {
            String interfaceC3589e4 = interfaceC3589e.toString();
            AbstractC5542e.metrica(interfaceC3589e4);
            Integer m4566abstract = C18540e.m4564default().m4566abstract(interfaceC3589e4);
            if (m4566abstract != null) {
                this.f14909e = m4566abstract.byteValue();
                return;
            } else {
                this.f14909e = (byte) -1;
                return;
            }
        }
        if (ordinal != 133) {
            if (ordinal != 148) {
                return;
            }
            this.f14910e = AbstractC2251e.admob(4, interfaceC3589e.toString());
        } else {
            String interfaceC3589e5 = interfaceC3589e.toString();
            AbstractC5542e.metrica(interfaceC3589e5);
            this.f14913e = AbstractC2251e.admob(30, interfaceC3589e5);
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        int ordinal = enumC8271e.ordinal();
        if (ordinal == 2) {
            return AbstractC9621e.license(this.f14912e);
        }
        if (ordinal == 11) {
            return AbstractC9621e.license(this.f14914e);
        }
        if (ordinal == 22) {
            return AbstractC9621e.license(inmobi());
        }
        if (ordinal == 43) {
            C18540e m4564default = C18540e.m4564default();
            int i = this.f14909e & 255;
            if (m4564default.mo269instanceof(i)) {
                return AbstractC9621e.ad(((String[]) m4564default.f36383e)[i]);
            }
        } else {
            if (ordinal == 133) {
                return AbstractC9621e.license(this.f14913e);
            }
            if (ordinal == 148) {
                return AbstractC9621e.license(this.f14910e);
            }
        }
        return C1444e.f4274e;
    }

    public AbstractC8507e tapsense() {
        return f14907e;
    }
}
