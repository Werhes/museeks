package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.util.Rational;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7850e implements InterfaceC11206e, InterfaceC12217e, InterfaceC2295e, InterfaceC9483e, InterfaceC15288e, InterfaceC11207e, InterfaceC13777e, InterfaceC4317e, InterfaceC17717e, InterfaceC13838e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static C7850e f15894e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2831e f15895e = new C2831e(0, false, false, 0, 0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f15896e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15897e;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٍؘٖ] */
    public C7850e(float f, float f2, AbstractC3424e abstractC3424e) {
        C7988e c7988e;
        this.f15897e = 24;
        int[] iArr = AbstractC4422e.ad;
        if (abstractC3424e != null) {
            c7988e = new C7988e(f, f2, abstractC3424e);
        } else {
            ?? obj = new Object();
            obj.f31681e = new C6392e(f, f2, 0.01f);
            c7988e = obj;
        }
        this.f15896e = new C11467e(c7988e);
    }

    public C7850e(int i) {
        this.f15897e = i;
        switch (i) {
            case 23:
                this.f15896e = new C5363e(new C10673e(29, this));
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f15896e = new EnumMap(EnumC9102e.class);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f15896e = new HashMap();
                return;
            default:
                this.f15896e = new AtomicBoolean(false);
                return;
        }
    }

    public /* synthetic */ C7850e(int i, Object obj) {
        this.f15897e = i;
        this.f15896e = obj;
    }

    public /* synthetic */ C7850e(int i, boolean z) {
        this.f15897e = i;
    }

    public C7850e(AbstractC13258e abstractC13258e) {
        this.f15897e = 5;
        AbstractC10546e.ad(abstractC13258e, "output");
        this.f15896e = abstractC13258e;
        abstractC13258e.billing = this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٛٔ] */
    public C7850e(InterfaceC14388e interfaceC14388e) {
        this.f15897e = 22;
        float f = AbstractC9571e.ad;
        ?? obj = new Object();
        obj.f35653e = f;
        float vip = interfaceC14388e.vip();
        float f2 = AbstractC2905e.ad;
        obj.f35652e = vip * 386.0878f * 160.0f * 0.84f;
        this.f15896e = obj;
    }

    public C7850e(String str) {
        this.f15897e = 7;
        Parcel obtain = Parcel.obtain();
        this.f15896e = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public C7850e(EnumMap enumMap) {
        this.f15897e = 27;
        EnumMap enumMap2 = new EnumMap(EnumC9102e.class);
        this.f15896e = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: class, reason: not valid java name */
    public static int m2326class(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static synchronized C7850e crashlytics() {
        C7850e c7850e;
        synchronized (C7850e.class) {
            try {
                if (f15894e == null) {
                    f15894e = new C7850e(0, false);
                }
                c7850e = f15894e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7850e;
    }

    /* renamed from: goto, reason: not valid java name */
    public static int m2327goto(int i, boolean z) {
        return m2326class(i) + (z ? 1 : 0) + i;
    }

    /* renamed from: native, reason: not valid java name */
    public static int m2328native(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public static void m2329try(C7850e c7850e, InterfaceC11206e interfaceC11206e) {
        if (((InterfaceC11206e) c7850e.f15896e) != null) {
            throw new IllegalStateException();
        }
        c7850e.f15896e = interfaceC11206e;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m2330abstract(int i) {
        if (i < 128) {
            m2341protected(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                m2331break(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    @Override // defpackage.InterfaceC17717e
    public boolean ad() {
        ((C11467e) this.f15896e).getClass();
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f15896e).adcel(j, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًَٛ, eٌِٟ] */
    public C11626e ads() {
        return new C7850e(1, (OutputStream) this.f15896e);
    }

    @Override // defpackage.InterfaceC4317e
    public float advert(float f, float f2) {
        double vip = ((C18211e) this.f15896e).vip(f2);
        double d = AbstractC2905e.ad;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * vip) * r0.f35653e * r0.f35652e))) + f;
    }

    public boolean amazon(int i, int i2) {
        RunnableC1887e runnableC1887e = (RunnableC1887e) this.f15896e;
        Object obj = ((List) runnableC1887e.f5025e).get(i);
        Object obj2 = ((List) runnableC1887e.f5027e).get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Object obj3 = ((C1847e) runnableC1887e.f5024e).vip.f36382e;
        return AbstractC7890e.billing(obj instanceof InterfaceC15377e ? ((InterfaceC15377e) obj).getVip() : String.valueOf(obj.hashCode()), obj2 instanceof InterfaceC15377e ? ((InterfaceC15377e) obj2).getVip() : String.valueOf(obj2.hashCode()));
    }

    public void applovin(int i, int i2) {
        RunnableC1887e runnableC1887e = (RunnableC1887e) this.f15896e;
        Object obj = ((List) runnableC1887e.f5025e).get(i);
        Object obj2 = ((List) runnableC1887e.f5027e).get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = ((C1847e) runnableC1887e.f5024e).vip.f36382e;
    }

    public boolean appmetrica(int i, int i2) {
        RunnableC1887e runnableC1887e = (RunnableC1887e) this.f15896e;
        Object obj = ((List) runnableC1887e.f5025e).get(i);
        Object obj2 = ((List) runnableC1887e.f5027e).get(i2);
        if (obj != null && obj2 != null) {
            ((C1400e) ((C1847e) runnableC1887e.f5024e).vip.f36382e).getClass();
            return obj.equals(obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.InterfaceC4317e
    public float billing(float f, float f2, long j) {
        long j2 = j / 1000000;
        C13219e ad = ((C18211e) this.f15896e).ad(f2);
        long j3 = ad.metrica;
        return (Math.signum(ad.ad) * ad.vip * AbstractC2966e.ad(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).ad) + f;
    }

    /* renamed from: break, reason: not valid java name */
    public void m2331break(byte[] bArr, int i, int i2) {
        ((OutputStream) this.f15896e).write(bArr, i, i2);
    }

    /* renamed from: case, reason: not valid java name */
    public void m2332case(boolean z, int i, subs[] subsVarArr) {
        m2343super(i, z);
        m2341protected(128);
        mo2334default(subsVarArr);
        m2341protected(0);
        m2341protected(0);
    }

    /* renamed from: catch, reason: not valid java name */
    public void m2333catch(int i, Object obj, InterfaceC11115e interfaceC11115e) {
        AbstractC13258e abstractC13258e = (AbstractC13258e) this.f15896e;
        abstractC13258e.isVip(i, 3);
        interfaceC11115e.billing((AbstractC7718e) obj, abstractC13258e.billing);
        abstractC13258e.isVip(i, 4);
    }

    @Override // defpackage.InterfaceC15288e
    public void close() {
        ((C14530e) this.f15896e).close();
    }

    /* renamed from: default, reason: not valid java name */
    public void mo2334default(subs[] subsVarArr) {
        for (subs subsVar : subsVarArr) {
            subsVar.billing().Signature(this, true);
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public void m2335extends() {
        ((C2386e) this.f15896e).f6095e.m4049break();
    }

    /* renamed from: final, reason: not valid java name */
    public void m2336final(int i, int i2) {
        if (i2 < 31) {
            m2341protected(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        m2331break(bArr, i4, 6 - i4);
    }

    @Override // defpackage.InterfaceC13838e
    public int firebase() {
        return 56;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        InterfaceC11206e interfaceC11206e = (InterfaceC11206e) this.f15896e;
        if (interfaceC11206e != null) {
            return interfaceC11206e.get();
        }
        throw new IllegalStateException();
    }

    /* renamed from: implements, reason: not valid java name */
    public void m2337implements(int i, boolean z, byte[] bArr) {
        m2343super(i, z);
        m2330abstract(bArr.length);
        m2331break(bArr, 0, bArr.length);
    }

    @Override // defpackage.InterfaceC13838e
    public void init(InterfaceC3894e interfaceC3894e) {
        this.f15896e = (C14061e) interfaceC3894e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC17717e
    public long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f15896e).inmobi(abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: interface */
    public void mo2225interface(String str) {
        C12402e c12402e = (C12402e) this.f15896e;
        AbstractC5756e.yandex(c12402e, 34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = AbstractC13517e.ad;
            if (charAt < strArr.length && strArr[charAt] != null) {
                AbstractC5756e.startapp(c12402e, str, i, i2);
                String str2 = strArr[charAt];
                AbstractC5756e.startapp(c12402e, str2, 0, str2.length());
                i = i2 + 1;
            }
        }
        AbstractC5756e.startapp(c12402e, str, i, str.length());
        AbstractC5756e.yandex(c12402e, 34);
    }

    @Override // defpackage.InterfaceC12217e
    public Object isPro(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((InterfaceC8292e) this.f15896e).appmetrica(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // defpackage.InterfaceC13838e
    public void isVip(InterfaceC3894e interfaceC3894e, byte[] bArr, int i) {
        C14061e c14061e = (C14061e) this.f15896e;
        c14061e.getClass();
        byte[] bArr2 = new byte[56];
        System.arraycopy(((C0719e) interfaceC3894e).f3013e, 0, bArr2, 0, 56);
        byte[] bArr3 = c14061e.f27809e;
        int[] iArr = new int[14];
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = i2 * 4;
            iArr[i2] = ((bArr3[i3 + 1] & 255) << 8) | (bArr3[i3] & 255) | ((bArr3[i3 + 2] & 255) << 16) | (bArr3[i3 + 3] << 24);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | RecyclerView.UNDEFINED_DURATION;
        int[] iArr2 = new int[16];
        AbstractC14410e.yandex(0, 0, bArr2, iArr2);
        AbstractC14410e.yandex(7, 2, bArr2, iArr2);
        AbstractC14410e.yandex(14, 4, bArr2, iArr2);
        AbstractC14410e.yandex(21, 6, bArr2, iArr2);
        AbstractC14410e.yandex(28, 8, bArr2, iArr2);
        AbstractC14410e.yandex(35, 10, bArr2, iArr2);
        AbstractC14410e.yandex(42, 12, bArr2, iArr2);
        AbstractC14410e.yandex(49, 14, bArr2, iArr2);
        int[] iArr3 = new int[16];
        AbstractC14410e.appmetrica(0, 0, iArr2, iArr3);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        iArr5[0] = 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int i4 = 447;
        int i5 = 1;
        while (true) {
            AbstractC14410e.vip(iArr5, iArr6, iArr7);
            AbstractC14410e.signatures(iArr5, iArr6, iArr5);
            AbstractC14410e.vip(iArr3, iArr4, iArr6);
            AbstractC14410e.signatures(iArr3, iArr4, iArr3);
            AbstractC14410e.Signature(iArr7, iArr3, iArr7);
            AbstractC14410e.Signature(iArr5, iArr6, iArr5);
            AbstractC14410e.remoteconfig(iArr6, iArr6);
            AbstractC14410e.remoteconfig(iArr3, iArr3);
            AbstractC14410e.signatures(iArr6, iArr3, iArr8);
            AbstractC14410e.loadAd(39082, iArr8, iArr4);
            AbstractC14410e.vip(iArr4, iArr3, iArr4);
            AbstractC14410e.Signature(iArr4, iArr8, iArr4);
            AbstractC14410e.Signature(iArr3, iArr6, iArr3);
            AbstractC14410e.signatures(iArr7, iArr5, iArr6);
            AbstractC14410e.vip(iArr7, iArr5, iArr5);
            AbstractC14410e.remoteconfig(iArr5, iArr5);
            AbstractC14410e.remoteconfig(iArr6, iArr6);
            AbstractC14410e.Signature(iArr6, iArr2, iArr6);
            int i6 = i4 - 1;
            int i7 = (iArr[i6 >>> 5] >>> (i6 & 31)) & 1;
            int i8 = i5 ^ i7;
            AbstractC14410e.purchase(i8, iArr3, iArr5);
            AbstractC14410e.purchase(i8, iArr4, iArr6);
            if (i6 < 2) {
                break;
            }
            i5 = i7;
            i4 = i6;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            int[] iArr9 = new int[16];
            int[] iArr10 = new int[16];
            AbstractC14410e.vip(iArr3, iArr4, iArr9);
            AbstractC14410e.signatures(iArr3, iArr4, iArr10);
            AbstractC14410e.remoteconfig(iArr9, iArr9);
            AbstractC14410e.remoteconfig(iArr10, iArr10);
            AbstractC14410e.Signature(iArr9, iArr10, iArr3);
            AbstractC14410e.signatures(iArr9, iArr10, iArr9);
            AbstractC14410e.loadAd(39082, iArr9, iArr4);
            AbstractC14410e.vip(iArr4, iArr10, iArr4);
            AbstractC14410e.Signature(iArr4, iArr9, iArr4);
        }
        AbstractC14410e.smaato(iArr4, iArr4);
        AbstractC14410e.Signature(iArr3, iArr4, iArr3);
        AbstractC14410e.admob(iArr3, 1);
        AbstractC14410e.admob(iArr3, -1);
        AbstractC14410e.adcel(i, bArr, iArr3);
        int i10 = 0;
        for (int i11 = 0; i11 < 56; i11++) {
            i10 |= bArr[i + i11];
        }
        if (i10 == 0) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }

    @Override // defpackage.InterfaceC2295e
    public /* bridge */ /* synthetic */ void license(Object obj) {
    }

    public C16885e loadAd() {
        C5106e purchase;
        C5609e c5609e = (C5609e) this.f15896e;
        C8839e c8839e = (C8839e) c5609e.f11961e;
        synchronized (c8839e.f17753e) {
            c5609e.metrica(true);
            purchase = c8839e.purchase(((C4016e) c5609e.f11962e).ad);
        }
        if (purchase != null) {
            return new C16885e(purchase);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4317e
    public float metrica() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC4317e
    public long mopub(float f) {
        return ((long) (Math.exp(((C18211e) this.f15896e).vip(f) / (AbstractC2905e.ad - 1.0d)) * 1000.0d)) * 1000000;
    }

    /* renamed from: new, reason: not valid java name */
    public void m2338new(int i, Object obj, InterfaceC11115e interfaceC11115e) {
        AbstractC7718e abstractC7718e = (AbstractC7718e) obj;
        AbstractC13258e abstractC13258e = (AbstractC13258e) this.f15896e;
        abstractC13258e.isVip(i, 2);
        abstractC13258e.isPro(abstractC7718e.ad(interfaceC11115e));
        interfaceC11115e.billing(abstractC7718e, this);
    }

    /* renamed from: package, reason: not valid java name */
    public void m2339package(EnumC9102e enumC9102e, int i) {
        EnumC11730e enumC11730e;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    enumC11730e = EnumC11730e.MANIFEST;
                } else if (i != 0) {
                    enumC11730e = i != 30 ? EnumC11730e.UNSET : EnumC11730e.INITIALIZATION;
                }
            }
            enumC11730e = EnumC11730e.API;
        } else {
            enumC11730e = EnumC11730e.TCF;
        }
        ((EnumMap) this.f15896e).put((EnumMap) enumC9102e, (EnumC9102e) enumC11730e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕٚ, eًَٛ] */
    public C15987e premium() {
        return new C7850e(1, (OutputStream) this.f15896e);
    }

    /* renamed from: private, reason: not valid java name */
    public void mo2340private(Cdefault[] cdefaultArr) {
        for (Cdefault cdefault : cdefaultArr) {
            cdefault.Signature(this, true);
        }
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f15896e).pro(j, abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    /* renamed from: protected, reason: not valid java name */
    public void m2341protected(int i) {
        ((OutputStream) this.f15896e).write(i);
    }

    @Override // defpackage.InterfaceC4317e
    public float purchase(float f, long j) {
        long j2 = j / 1000000;
        C13219e ad = ((C18211e) this.f15896e).ad(f);
        long j3 = ad.metrica;
        return (((Math.signum(ad.ad) * AbstractC2966e.ad(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).vip) * ad.vip) / ((float) j3)) * 1000.0f;
    }

    public long remoteconfig() {
        Parcel parcel = (Parcel) this.f15896e;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return C4616e.ad(j, 0L) ? C12973e.metrica : AbstractC13362e.mopub(parcel.readFloat(), j);
    }

    public C2691e signatures(String str) {
        C6798e vip;
        Class license = AbstractC15365e.license((ClassLoader) this.f15896e, str);
        if (license == null || (vip = AbstractC4256e.vip(license)) == null) {
            return null;
        }
        return new C2691e(11, vip);
    }

    @Override // defpackage.InterfaceC15288e
    public AbstractC3743e smaato() {
        return (C14530e) this.f15896e;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [eؒؐ, eٓؕؓ] */
    @Override // defpackage.InterfaceC13777e
    public void startapp(C6122e c6122e) {
        C4096e c4096e;
        if (!AbstractC13062e.purchase()) {
            AbstractC10077e.Signature(((C8356e) this.f15896e).getContext()).execute(new RunnableC11247e(this, c6122e, 2));
            return;
        }
        AbstractC9464e.yandex("PreviewView", "Surface requested by Preview.");
        InterfaceC2881e interfaceC2881e = c6122e.appmetrica;
        ((C8356e) this.f15896e).f17104e = interfaceC2881e.subscription();
        C2884e c2884e = ((C8356e) this.f15896e).f17106e;
        Rect mopub = interfaceC2881e.subscription().mopub();
        c2884e.getClass();
        c2884e.ad = new Rational(mopub.width(), mopub.height());
        synchronized (c2884e) {
            c2884e.metrica = mopub;
        }
        c6122e.vip(AbstractC10077e.Signature(((C8356e) this.f15896e).getContext()), new C9509e(11, this, interfaceC2881e, c6122e));
        C8356e c8356e = (C8356e) this.f15896e;
        AbstractC13757e abstractC13757e = c8356e.f17101e;
        EnumC7617e enumC7617e = c8356e.f17107e;
        if (!(abstractC13757e instanceof C4096e) || C8356e.metrica(c6122e, enumC7617e)) {
            C8356e c8356e2 = (C8356e) this.f15896e;
            if (C8356e.metrica(c6122e, c8356e2.f17107e)) {
                C8356e c8356e3 = (C8356e) this.f15896e;
                ?? abstractC13757e2 = new AbstractC13757e(c8356e3, c8356e3.f17105e);
                abstractC13757e2.startapp = false;
                abstractC13757e2.mopub = new AtomicReference();
                c4096e = abstractC13757e2;
            } else {
                C8356e c8356e4 = (C8356e) this.f15896e;
                c4096e = new C4096e(c8356e4, c8356e4.f17105e);
            }
            c8356e2.f17101e = c4096e;
        }
        InterfaceC12424e subscription = interfaceC2881e.subscription();
        C8356e c8356e5 = (C8356e) this.f15896e;
        C16255e c16255e = new C16255e(subscription, c8356e5.f17109e, c8356e5.f17101e);
        ((C8356e) this.f15896e).f17108e.set(c16255e);
        interfaceC2881e.ad().metrica(AbstractC10077e.Signature(((C8356e) this.f15896e).getContext()), c16255e);
        ((C8356e) this.f15896e).f17101e.appmetrica(c6122e, new C9509e(12, this, c16255e, interfaceC2881e));
        C8356e c8356e6 = (C8356e) this.f15896e;
        if (c8356e6.indexOfChild(c8356e6.f17098e) == -1) {
            C8356e c8356e7 = (C8356e) this.f15896e;
            c8356e7.addView(c8356e7.f17098e);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void mo2342strictfp(Cdefault cdefault) {
        cdefault.Signature(this, true);
    }

    @Override // defpackage.InterfaceC9483e
    public void subs(char c) {
        AbstractC5756e.yandex((C12402e) this.f15896e, c);
    }

    public long subscription() {
        int i = C3618e.mopub;
        long readLong = ((Parcel) this.f15896e).readLong();
        long j = 63 & readLong;
        return j < 16 ? readLong : (readLong & (-64)) | (j + 1);
    }

    /* renamed from: super, reason: not valid java name */
    public void m2343super(int i, boolean z) {
        if (z) {
            m2341protected(i);
        }
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return ((C11467e) this.f15896e).tapsense(abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: this */
    public void mo2228this(String str) {
        AbstractC5756e.startapp((C12402e) this.f15896e, str, 0, str.length());
    }

    /* renamed from: throw, reason: not valid java name */
    public void m2344throw(C4956e c4956e, Thread thread, Throwable th) {
        C4594e c4594e = (C4594e) this.f15896e;
        synchronized (c4594e) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            AbstractC5092e.appmetrica();
            try {
                AbstractC16802e.ad(((ExecutorC4614e) c4594e.appmetrica.f25751e).vip(new CallableC9235e(c4594e, System.currentTimeMillis(), th, thread, c4956e)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public String toString() {
        switch (this.f15897e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                StringBuilder sb = new StringBuilder("1");
                for (EnumC9102e enumC9102e : EnumC9102e.values()) {
                    EnumC11730e enumC11730e = (EnumC11730e) ((EnumMap) this.f15896e).get(enumC9102e);
                    if (enumC11730e == null) {
                        enumC11730e = EnumC11730e.UNSET;
                    }
                    sb.append(enumC11730e.f23581e);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m2345transient(EnumC9102e enumC9102e, EnumC11730e enumC11730e) {
        ((EnumMap) this.f15896e).put((EnumMap) enumC9102e, (EnumC9102e) enumC11730e);
    }

    @Override // defpackage.InterfaceC11207e
    public ByteBuffer vip() {
        return (ByteBuffer) this.f15896e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [eؚؖٞ, java.lang.Object] */
    /* renamed from: while, reason: not valid java name */
    public ArrayList m2346while(int i) {
        ArrayList arrayList = new ArrayList();
        C8202e c8202e = (C8202e) this.f15896e;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            C17908e c17908e = c8202e.vip ? c8202e.metrica : (C17908e) c8202e.appmetrica.getValue();
            if (c17908e != null) {
                ?? obj = new Object();
                obj.f8852e = 1;
                List list = (List) c17908e.mopub.invoke(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                C3967e c3967e = obj;
                while (i2 < size) {
                    C6571e c6571e = (C6571e) list.get(i2);
                    C7513e c7513e = c8202e.loadAd;
                    int intValue = ((Number) c6571e.f13544e).intValue();
                    long j = ((C5602e) c6571e.f13543e).ad;
                    C11883e c11883e = C8202e.isVip;
                    C3967e c3967e2 = c3967e;
                    arrayList.add(c7513e.ad(intValue, j, false, new C17819e((ArrayList) null, c3967e2, list, i, c17908e)));
                    i2++;
                    c3967e = c3967e2;
                }
                Unit unit = Unit.INSTANCE;
            }
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            return arrayList;
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC9483e
    public void writeLong(long j) {
        mo2228this(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ((C12997e) this.f15896e).close();
    }
}
