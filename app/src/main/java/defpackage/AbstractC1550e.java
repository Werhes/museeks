package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyEncrypted;
import ealvatag.tag.id3.framebody.FrameBodyUnsupported;
import ealvatag.tag.id3.framebody.FrameIdentifierException;
import ealvatag.tag.id3.framebody.Id3FrameBodyFactories;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1550e extends AbstractC14583e implements InterfaceC16681e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C7936e f4422e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f4423e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public AbstractC0424e f4424e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f4425e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C2026e f4426e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f4427e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f4422e = new C7936e(2);
    }

    public AbstractC1550e() {
        this.f4425e = BuildConfig.FLAVOR;
        this.f4427e = BuildConfig.FLAVOR;
        this.f4426e = null;
        this.f4424e = null;
    }

    public AbstractC1550e(String str) {
        this.f4425e = BuildConfig.FLAVOR;
        this.f4427e = BuildConfig.FLAVOR;
        this.f4426e = null;
        this.f4424e = null;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f4422e;
        c7936e.getClass();
        int i = C1724e.ad;
        this.f4425e = str;
        try {
            this.f28795e = (AbstractC12444e) Class.forName("ealvatag.tag.id3.framebody.FrameBody".concat(str)).newInstance();
        } catch (ClassNotFoundException unused) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            this.f28795e = new FrameBodyUnsupported(str);
        } catch (IllegalAccessException e) {
            e = e;
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            e = e2;
            EnumC1005e[] enumC1005eArr32 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i32 = C1724e.ad;
            throw new RuntimeException(e);
        }
        this.f28795e.setHeader(this);
        if (this instanceof C2992e) {
            AbstractC12444e abstractC12444e = this.f28795e;
            C12927e.license();
            abstractC12444e.setTextEncoding((byte) 0);
        } else if (this instanceof C6276e) {
            AbstractC12444e abstractC12444e2 = this.f28795e;
            C12927e.license();
            abstractC12444e2.setTextEncoding((byte) 0);
        }
        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
        c7936e.getClass();
    }

    public static boolean isVip(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return str.equals("PIC") || str.equals("APIC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؗٔۙ, eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eِٖۢ, java.lang.Object] */
    public static C16151e pro(C16151e c16151e, int i, int i2) {
        ?? obj = new Object();
        c16151e.crashlytics(obj, i);
        ?? obj2 = new Object();
        new C13197e(new C15532e(obj, new Inflater())).purchase(obj2, i2);
        return obj2;
    }

    public final FrameBodyEncrypted ads(String str, C16151e c16151e, int i) {
        try {
            FrameBodyEncrypted frameBodyEncrypted = new FrameBodyEncrypted(str, c16151e, i);
            frameBodyEncrypted.setHeader(this);
            return frameBodyEncrypted;
        } catch (C10144e e) {
            throw new Exception(e);
        }
    }

    public final AbstractID3v2FrameBody applovin(String str, ByteBuffer byteBuffer, int i) {
        AbstractID3v2FrameBody frameBodyUnsupported;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f4422e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        try {
            frameBodyUnsupported = (AbstractID3v2FrameBody) Class.forName("ealvatag.tag.id3.framebody.FrameBody".concat(str)).getConstructor(Class.forName("java.nio.ByteBuffer"), Integer.TYPE).newInstance(byteBuffer, Integer.valueOf(i));
        } catch (ClassNotFoundException unused) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            try {
                frameBodyUnsupported = new FrameBodyUnsupported(byteBuffer, i);
            } catch (C14572e e) {
                throw e;
            } catch (C10144e e2) {
                throw new Exception(e2.getMessage());
            }
        } catch (IllegalAccessException e3) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            e3.getMessage();
            c7936e.getClass();
            int i4 = C1724e.ad;
            throw new RuntimeException(e3.getMessage());
        } catch (InstantiationException e4) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            e4.getMessage();
            c7936e.getClass();
            int i5 = C1724e.ad;
            throw new RuntimeException(e4.getMessage());
        } catch (NoSuchMethodException e5) {
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            e5.getMessage();
            c7936e.getClass();
            int i6 = C1724e.ad;
            throw new RuntimeException(e5.getMessage());
        } catch (InvocationTargetException e6) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            e6.getCause().getMessage();
            c7936e.getClass();
            int i7 = C1724e.ad;
            if (e6.getCause() instanceof Error) {
                throw ((Error) e6.getCause());
            }
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            if (e6.getCause() instanceof C14572e) {
                throw ((C14572e) e6.getCause());
            }
            if (e6.getCause() instanceof C10754e) {
                throw ((C10754e) e6.getCause());
            }
            throw new Exception(e6.getCause().getMessage());
        }
        EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
        c7936e.getClass();
        frameBodyUnsupported.setHeader(this);
        return frameBodyUnsupported;
    }

    public final String crashlytics(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[tapsense()];
        if (tapsense() <= byteBuffer.remaining()) {
            byteBuffer.get(bArr, 0, tapsense());
        }
        if (inmobi(bArr)) {
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4427e, ":only padding found"));
        }
        if (signatures() - tapsense() <= byteBuffer.remaining()) {
            String str = new String(bArr);
            this.f4425e = str;
            return str;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f4422e.getClass();
        int i = C1724e.ad;
        throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4427e, ":No space to find another frame"));
    }

    @Override // defpackage.AbstractC14583e
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC1550e) {
            return super.equals((AbstractC1550e) obj);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        return this.f4425e;
    }

    public boolean inmobi(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return this.f28795e == null;
    }

    public final AbstractID3v2FrameBody isPro(String str, C16151e c16151e, int i) {
        AbstractID3v2FrameBody frameBodyUnsupported;
        try {
            frameBodyUnsupported = Id3FrameBodyFactories.instance().make(str, c16151e, i);
        } catch (FrameIdentifierException unused) {
            frameBodyUnsupported = new FrameBodyUnsupported(c16151e, i);
        }
        frameBodyUnsupported.setHeader(this);
        return frameBodyUnsupported;
    }

    public final FrameBodyEncrypted premium(String str, ByteBuffer byteBuffer, int i) {
        try {
            FrameBodyEncrypted frameBodyEncrypted = new FrameBodyEncrypted(str, byteBuffer, i);
            frameBodyEncrypted.setHeader(this);
            return frameBodyEncrypted;
        } catch (C10144e e) {
            throw new Exception(e);
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public abstract int signatures();

    public final String subs(C16151e c16151e) {
        int tapsense = tapsense();
        long j = tapsense;
        if (j > c16151e.f31731e) {
            return BuildConfig.FLAVOR;
        }
        String mo1683e = c16151e.mo1683e(j, Charset.defaultCharset());
        this.f4425e = mo1683e;
        if (mo1683e.isEmpty()) {
            throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4427e, ":only padding found"));
        }
        long signatures = signatures() - tapsense;
        long j2 = c16151e.f31731e;
        C7936e c7936e = f4422e;
        if (signatures <= j2) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            return this.f4425e;
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.f4427e, ":No space to find another frame"));
    }

    public abstract int tapsense();

    public abstract void write(ByteArrayOutputStream byteArrayOutputStream);

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        return this.f28795e.getUserFriendlyValue();
    }
}
