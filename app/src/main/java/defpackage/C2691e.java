package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.widget.NestedScrollView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2691e implements InterfaceC11987e, InterfaceC2295e, InterfaceC15269e, InterfaceC2227e, InterfaceC10098e, InterfaceC4529e, InterfaceC11104e, InterfaceC3934e, InterfaceC3209e, InterfaceC18508e, InterfaceC15135e, InterfaceC10544e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static C2691e f6569e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f6570e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6571e;

    public C2691e(int i) {
        this.f6571e = i;
        switch (i) {
            case 3:
                this.f6570e = new C13391e(9);
                return;
            case 4:
                return;
            case 9:
                this.f6570e = null;
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f6570e = new Object();
                return;
            case 22:
                this.f6570e = new SparseArray();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f6570e = new AtomicInteger();
                return;
            default:
                this.f6570e = new CopyOnWriteArrayList();
                return;
        }
    }

    public /* synthetic */ C2691e(int i, Object obj) {
        this.f6571e = i;
        this.f6570e = obj;
    }

    public C2691e(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f6571e = 8;
        this.f6570e = new GestureDetector(context, simpleOnGestureListener, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eٍۜۖ, eََۗ, java.lang.Object] */
    public C2691e(View view) {
        this.f6571e = 20;
        if (Build.VERSION.SDK_INT < 30) {
            this.f6570e = new C9770e(23, view);
            return;
        }
        ?? c9770e = new C9770e(23, view);
        c9770e.f20154e = view;
        this.f6570e = c9770e;
    }

    public C2691e(C6831e c6831e) {
        this.f6571e = 16;
        int i = c6831e.purchase;
        this.f6570e = new C9770e[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C9770e[]) this.f6570e)[i2] = new C9770e(c6831e);
        }
    }

    public C2691e(AbstractC10423e abstractC10423e) {
        this.f6571e = 19;
        this.f6570e = AbstractC14430e.appmetrica(EnumC14109e.f27904e);
    }

    public C2691e(C15398e c15398e) {
        this.f6571e = 25;
        this.f6570e = c15398e.f30352e;
    }

    /* renamed from: class, reason: not valid java name */
    public static int[] m1038class(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = crashlytics(i2 * 2, bArr);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    public static int crashlytics(int i, byte[] bArr) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    /* renamed from: extends, reason: not valid java name */
    private final void m1039extends(Throwable th) {
    }

    /* renamed from: goto, reason: not valid java name */
    public static int m1040goto(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    public static int inmobi(int i) {
        return (0 - i) & 65535;
    }

    /* renamed from: this, reason: not valid java name */
    public static int m1041this(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = ((i5 * i2) + i4) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = ((i6 * i4) + i2) & 65535;
        }
        return (1 - i2) & 65535;
    }

    /* renamed from: try, reason: not valid java name */
    public static void m1042try(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    @Override // defpackage.InterfaceC10098e
    public boolean Signature(float f) {
        if (f == 0.0f) {
            return false;
        }
        isVip();
        ((NestedScrollView) this.f6570e).mopub((int) f);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِّؔ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eٗۛۖ] */
    @Override // defpackage.InterfaceC18508e
    public C7306e ad() {
        ?? obj = new Object();
        EnumC5396e enumC5396e = AbstractC4214e.metrica() ? EnumC5396e.TYPE_THICK : EnumC5396e.TYPE_THIN;
        EnumC3305e enumC3305e = (EnumC3305e) this.f6570e;
        obj.f6385e = enumC5396e;
        ?? obj2 = new Object();
        obj2.f33877e = enumC3305e;
        obj.f6384e = new C6861e(obj2);
        return new C7306e(obj, 0);
    }

    @Override // defpackage.InterfaceC15135e
    public void adcel(AbstractC1215e abstractC1215e, int i) {
        C18482e c18482e = C0055e.startapp;
        C0055e.startapp.vip("onSessionSuspended with reason = %d", Integer.valueOf(i));
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.appmetrica();
        AbstractC9528e.startapp(c0055e.billing);
        c0055e.ad.ad(c0055e.metrica.ad(c0055e.billing, i), 225);
        c0055e.ad();
        c0055e.appmetrica.removeCallbacks(c0055e.license);
    }

    @Override // defpackage.InterfaceC15135e
    public void admob(AbstractC1215e abstractC1215e, boolean z) {
        C18482e c18482e = C0055e.startapp;
        C0055e.startapp.vip("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.appmetrica();
        AbstractC9528e.startapp(c0055e.billing);
        C7935e c7935e = c0055e.metrica;
        C7322e c7322e = c0055e.billing;
        C0140e c0140e = c0055e.ad;
        C17488e vip = c7935e.vip(c7322e);
        C1282e smaato = C2440e.smaato(vip.license());
        smaato.ad();
        ((C2440e) smaato.f20053e).Signature(z);
        vip.ad();
        ((C4469e) vip.f20053e).tapsense((C2440e) smaato.metrica());
        c0140e.ad((C4469e) vip.metrica(), 227);
        c0055e.ad();
        c0055e.metrica();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ads(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C16304e
            if (r0 == 0) goto L13
            r0 = r5
            eٖٙۙ r0 = (defpackage.C16304e) r0
            int r1 = r0.f32052e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32052e = r1
            goto L18
        L13:
            eٖٙۙ r0 = new eٖٙۙ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32051e
            int r0 = r0.f32052e
            if (r0 == 0) goto L3f
            r1 = 1
            if (r0 != r1) goto L37
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Object r5 = r4.f6570e
            eًؗٔ r5 = (defpackage.C7744e) r5
            eٜٓ۟ r0 = defpackage.EnumC14109e.f27904e
            eٜٓ۟ r1 = defpackage.EnumC14109e.f27902e
            boolean r5 = r5.ad(r0, r1)
            if (r5 == 0) goto L35
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L35:
            r5 = 0
            throw r5
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L3f:
            defpackage.AbstractC2003e.purchase(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2691e.ads(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC15135e
    public /* synthetic */ void advert(AbstractC1215e abstractC1215e, int i) {
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.vip(i);
    }

    @Override // defpackage.InterfaceC15135e
    public /* synthetic */ void amazon(AbstractC1215e abstractC1215e) {
        ((C0055e) this.f6570e).yandex = (C10078e) abstractC1215e;
    }

    public void applovin(StringBuilder sb, Iterator it) {
        C7364e c7364e = (C7364e) this.f6570e;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(C7364e.purchase(entry.getKey()));
            sb.append("=");
            sb.append(C7364e.purchase(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) c7364e.f15099e);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(C7364e.purchase(entry2.getKey()));
                sb.append("=");
                sb.append(C7364e.purchase(entry2.getValue()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    @Override // defpackage.InterfaceC15135e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appmetrica(defpackage.AbstractC1215e r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2691e.appmetrica(eٌؒٞ, java.lang.String):void");
    }

    @Override // defpackage.InterfaceC15135e
    public /* synthetic */ void billing(AbstractC1215e abstractC1215e, int i) {
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.vip(i);
    }

    public byte[] firebase(byte[] bArr, int i, int i2, byte[] bArr2, C13935e c13935e) {
        if (i2 == 0) {
            return AbstractC12442e.license(bArr);
        }
        if (i + i2 > 15) {
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC3628e.billing(i + i3, 28, (byte[]) c13935e.f27641e);
            bArr = ((AbstractC7629e) this.f6570e).ad(c13935e, bArr2, bArr);
        }
        return bArr;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        C14679e c14679e = (C14679e) ((C15816e) this.f6570e).f31190e;
        C11196e c11196e = C11196e.ad;
        return C11196e.ad(c14679e);
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        int[] iArr;
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to IDEA init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (z) {
            iArr = m1038class(bArr);
        } else {
            int[] m1038class = m1038class(bArr);
            int[] iArr2 = new int[52];
            int m1041this = m1041this(m1038class[0]);
            int inmobi = inmobi(m1038class[1]);
            int inmobi2 = inmobi(m1038class[2]);
            iArr2[51] = m1041this(m1038class[3]);
            iArr2[50] = inmobi2;
            iArr2[49] = inmobi;
            int i = 48;
            iArr2[48] = m1041this;
            int i2 = 4;
            for (int i3 = 1; i3 < 8; i3++) {
                int i4 = m1038class[i2];
                iArr2[i - 1] = m1038class[i2 + 1];
                iArr2[i - 2] = i4;
                int m1041this2 = m1041this(m1038class[i2 + 2]);
                int inmobi3 = inmobi(m1038class[i2 + 3]);
                int i5 = i2 + 5;
                int inmobi4 = inmobi(m1038class[i2 + 4]);
                i2 += 6;
                iArr2[i - 3] = m1041this(m1038class[i5]);
                iArr2[i - 4] = inmobi3;
                iArr2[i - 5] = inmobi4;
                i -= 6;
                iArr2[i] = m1041this2;
            }
            int i6 = m1038class[i2];
            iArr2[i - 1] = m1038class[i2 + 1];
            iArr2[i - 2] = i6;
            int m1041this3 = m1041this(m1038class[i2 + 2]);
            int inmobi5 = inmobi(m1038class[i2 + 3]);
            int inmobi6 = inmobi(m1038class[i2 + 4]);
            iArr2[i - 3] = m1041this(m1038class[i2 + 5]);
            iArr2[i - 4] = inmobi6;
            iArr2[i - 5] = inmobi5;
            iArr2[i - 6] = m1041this3;
            iArr = iArr2;
        }
        this.f6570e = iArr;
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    /* renamed from: interface, reason: not valid java name */
    public void m1043interface(byte[] bArr) {
        int i = 0;
        while (true) {
            C9770e[] c9770eArr = (C9770e[]) this.f6570e;
            if (i >= c9770eArr.length) {
                return;
            }
            C9770e c9770e = c9770eArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                C18478e[] c18478eArr = (C18478e[]) c9770e.f19315e;
                if (i3 < c18478eArr.length) {
                    C18478e c18478e = c18478eArr[i3];
                    short s = (short) (i2 + i3);
                    C11883e c11883e = (C11883e) c18478e.f36229e;
                    c11883e.getClass();
                    C16253e c16253e = (C16253e) c11883e.f23815e;
                    byte[] bArr2 = new byte[842];
                    c16253e.reset();
                    c16253e.purchase(0, bArr.length, bArr);
                    c16253e.purchase(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
                    int i4 = 840;
                    c16253e.smaato(0, 840, bArr2);
                    int m4524else = C18478e.m4524else(c18478e, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, 840);
                    while (m4524else < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        c16253e.smaato(i5, 168, bArr2);
                        i4 = 168 + i5;
                        m4524else += C18478e.m4524else(c18478e, m4524else, 256 - m4524else, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 8;
    }

    @Override // defpackage.InterfaceC10098e
    public void isVip() {
        ((NestedScrollView) this.f6570e).f417e.abortAnimation();
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        switch (this.f6571e) {
            case 6:
                return;
            default:
                ((RunnableC2275e) this.f6570e).run();
                return;
        }
    }

    @Override // defpackage.InterfaceC15135e
    public /* synthetic */ void loadAd(AbstractC1215e abstractC1215e, int i) {
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.vip(i);
    }

    @Override // defpackage.InterfaceC10544e
    public C17996e metrica(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC10544e interfaceC10544e = ((InterfaceC10544e[]) this.f6570e)[i];
            if (interfaceC10544e.mo2947vip(cls)) {
                return interfaceC10544e.metrica(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC15135e
    public void mopub(AbstractC1215e abstractC1215e, String str) {
        C0055e.startapp.vip("onSessionStarted with sessionId = %s", str);
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        c0055e.appmetrica();
        C7322e c7322e = c0055e.billing;
        c7322e.purchase = str;
        c0055e.ad.ad((C4469e) c0055e.metrica.vip(c7322e).metrica(), 222);
        c0055e.ad();
        c0055e.metrica();
    }

    /* renamed from: native, reason: not valid java name */
    public void m1044native(Exception exc) {
        AbstractC2803e.billing("MediaCodecAudioRenderer", "Audio sink error", exc);
        C17424e c17424e = ((C9860e) this.f6570e).f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC13868e(c17424e, exc, 1));
        }
    }

    public void premium(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            if (i5 == 0) {
                i5 += 8;
                i6 = bArr[i];
                i++;
            }
            i5 -= ((AbstractC7629e) this.f6570e).vip;
            iArr[i2] = (i6 >>> i5) & 15;
            i4++;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        ((C14590e) this.f6570e).pro(c17985e, f, c7695e);
        return c17985e;
    }

    /* renamed from: protected, reason: not valid java name */
    public boolean m1045protected() {
        C6936e c6936e = (C6936e) this.f6570e;
        try {
            C12698e ad = C5277e.ad(c6936e.f14225e);
            if (ad != null) {
                return ad.metrica(128, "com.android.vending").versionCode >= 80837300;
            }
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.ad("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27497e.vip(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Type inference failed for: r7v2, types: [eِٖۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC4529e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C8650e purchase(defpackage.C2257e r12, defpackage.C11058e r13) {
        /*
            r11 = this;
            java.lang.Object r12 = r11.f6570e
            eًٕٝ r12 = (defpackage.C15601e) r12
            eؙۖؕ r12 = r12.metrica
            if (r12 != 0) goto La
            goto Ld4
        La:
            java.lang.Object r0 = r12.f13544e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r12.f13543e
            java.lang.String r12 = (java.lang.String) r12
            int r1 = r13.f21942e
            r2 = 407(0x197, float:5.7E-43)
            if (r1 != r2) goto Ld4
            eٕۡۡ r1 = r13.f21946e
            int r3 = r13.f21942e
            r4 = 401(0x191, float:5.62E-43)
            if (r3 == r4) goto L28
            if (r3 == r2) goto L25
            eْۨٝ r1 = defpackage.C13664e.f27089e
            goto L66
        L25:
            java.lang.String r2 = "Proxy-Authenticate"
            goto L2a
        L28:
            java.lang.String r2 = "WWW-Authenticate"
        L2a:
            eًؑۤ r3 = defpackage.AbstractC1277e.ad
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.size()
            r5 = 0
            r6 = r5
        L37:
            if (r6 >= r4) goto L65
            java.lang.String r7 = r1.billing(r6)
            boolean r7 = r2.equalsIgnoreCase(r7)
            if (r7 == 0) goto L62
            eِٖۢ r7 = new eِٖۢ
            r7.<init>()
            java.lang.String r8 = r1.adcel(r6)
            int r9 = r8.length()
            r7.m4133public(r5, r9, r8)
            defpackage.AbstractC1277e.vip(r7, r3)     // Catch: java.io.EOFException -> L57
            goto L62
        L57:
            r7 = move-exception
            eۖ۠ r8 = defpackage.AbstractC18303e.ad
            eۖ۠ r8 = defpackage.AbstractC18303e.ad
            java.lang.String r9 = "Unable to parse challenge"
            r10 = 5
            r8.adcel(r10, r9, r7)
        L62:
            int r6 = r6 + 1
            goto L37
        L65:
            r1 = r3
        L66:
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld4
            java.lang.Object r2 = r1.next()
            eٍؔۙ r2 = (defpackage.C2814e) r2
            java.lang.String r3 = r2.ad
            java.lang.String r4 = "Basic"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L88
            java.lang.String r4 = "OkHttp-Preemptive"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L6a
        L88:
            java.util.Map r1 = r2.vip
            java.lang.String r2 = "charset"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L99
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Exception -> L99
            goto L9b
        L99:
            java.nio.charset.Charset r1 = defpackage.AbstractC5508e.license
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 58
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            byte[] r12 = r12.getBytes(r1)
            byte[] r0 = defpackage.ad.ad
            java.lang.String r12 = defpackage.ad.ad(r12, r0)
            java.lang.String r0 = "Basic "
            java.lang.String r12 = r0.concat(r12)
            eٌّۢ r13 = r13.f21944e
            eۣۡ r13 = r13.ad()
            java.lang.Object r0 = r13.f36192e
            eؚٕۡ r0 = (defpackage.C15783e) r0
            java.lang.String r1 = "Proxy-Authorization"
            r0.adcel(r1, r12)
            eٌّۢ r12 = new eٌّۢ
            r12.<init>(r13)
            return r12
        Ld4:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2691e.purchase(eؓۧۥ, eٍُ٘):eٌّۢ");
    }

    @Override // defpackage.InterfaceC10098e
    public float remoteconfig() {
        return -((NestedScrollView) this.f6570e).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC11987e
    public void signatures(int i, float f) {
    }

    @Override // defpackage.InterfaceC11987e
    public void smaato(int i) {
    }

    @Override // defpackage.InterfaceC15135e
    public void startapp(AbstractC1215e abstractC1215e) {
        C18482e c18482e = C0055e.startapp;
        c18482e.vip("onSessionStarting", new Object[0]);
        C0055e c0055e = (C0055e) this.f6570e;
        c0055e.yandex = (C10078e) abstractC1215e;
        if (c0055e.billing != null) {
            Log.w(c18482e.ad, c18482e.license("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        c0055e.license();
        C7322e c7322e = c0055e.billing;
        C7935e c7935e = c0055e.metrica;
        C0140e c0140e = c0055e.ad;
        C17488e vip = c7935e.vip(c7322e);
        if (c7322e.Signature == 1) {
            C1282e smaato = C2440e.smaato(vip.license());
            smaato.ad();
            ((C2440e) smaato.f20053e).subscription(17);
            vip.appmetrica((C2440e) smaato.metrica());
        }
        c0140e.ad((C4469e) vip.metrica(), 221);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eِّ٘, java.lang.Object] */
    public C12425e subs() {
        Context context = (Context) this.f6570e;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ?? obj = new Object();
        obj.f24857e = C14665e.ad(AbstractC18271e.ad);
        C5389e c5389e = new C5389e(15, context);
        obj.f24855e = c5389e;
        obj.f24854e = C14665e.ad(new C3168e(c5389e, new C5389e(8, c5389e), 3));
        C5389e c5389e2 = obj.f24855e;
        obj.f24856e = new C6325e(24, c5389e2);
        InterfaceC16964e ad = C14665e.ad(new C11883e(obj.f24856e, C14665e.ad(new C15816e(11, c5389e2)), 14));
        obj.f24853e = ad;
        C10659e c10659e = new C10659e(8);
        C5389e c5389e3 = obj.f24855e;
        C6029e c6029e = new C6029e(3, c5389e3, ad, c10659e);
        InterfaceC16964e interfaceC16964e = obj.f24857e;
        InterfaceC16964e interfaceC16964e2 = obj.f24854e;
        obj.f24858e = C14665e.ad(new C6029e(8, new C18464e(interfaceC16964e, interfaceC16964e2, c6029e, ad, ad, 8), new C14461e(c5389e3, interfaceC16964e2, ad, c6029e, interfaceC16964e, ad, ad), new C11980e(interfaceC16964e, ad, c6029e, ad, 22)));
        return obj;
    }

    @Override // defpackage.InterfaceC11987e
    public void subscription(int i) {
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f6570e;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int crashlytics = crashlytics(i, bArr);
        int crashlytics2 = crashlytics(i + 2, bArr);
        int crashlytics3 = crashlytics(i + 4, bArr);
        int crashlytics4 = crashlytics(i + 6, bArr);
        int i3 = 0;
        int i4 = crashlytics3;
        int i5 = crashlytics2;
        int i6 = crashlytics;
        int i7 = 0;
        while (i3 < 8) {
            int m1040goto = m1040goto(i6, iArr[i7]);
            int i8 = (i5 + iArr[i7 + 1]) & 65535;
            int i9 = (i4 + iArr[i7 + 2]) & 65535;
            int m1040goto2 = m1040goto(crashlytics4, iArr[i7 + 3]);
            int i10 = i7 + 5;
            int m1040goto3 = m1040goto(i9 ^ m1040goto, iArr[i7 + 4]);
            i7 += 6;
            int m1040goto4 = m1040goto(((i8 ^ m1040goto2) + m1040goto3) & 65535, iArr[i10]);
            int i11 = 65535 & (m1040goto3 + m1040goto4);
            i6 = m1040goto ^ m1040goto4;
            crashlytics4 = m1040goto2 ^ i11;
            int i12 = i9 ^ m1040goto4;
            i3++;
            i4 = i8 ^ i11;
            i5 = i12;
        }
        m1042try(m1040goto(i6, iArr[i7]), i2, bArr2);
        m1042try(i4 + iArr[i7 + 1], i2 + 2, bArr2);
        m1042try(i5 + iArr[i7 + 2], i2 + 4, bArr2);
        m1042try(m1040goto(crashlytics4, iArr[i7 + 3]), i2 + 6, bArr2);
        return 8;
    }

    /* renamed from: throw, reason: not valid java name */
    public void m1046throw(C12916e c12916e, C9770e c9770e) {
        C18478e[] c18478eArr = (C18478e[]) c9770e.f19315e;
        int i = 0;
        int i2 = 0;
        while (true) {
            C9770e[] c9770eArr = (C9770e[]) this.f6570e;
            if (i2 >= c9770eArr.length) {
                return;
            }
            C18478e c18478e = ((C18478e[]) c12916e.f25784e)[i2];
            C9770e c9770e2 = c9770eArr[i2];
            C6831e c6831e = (C6831e) c18478e.f36227e;
            int i3 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            c6831e.subscription.getClass();
            c18478e.m4553strictfp(((C18478e[]) c9770e2.f19315e)[i], c18478eArr[i]);
            int i4 = 1;
            while (i4 < c6831e.billing) {
                C18478e c18478e2 = ((C18478e[]) c9770e2.f19315e)[i4];
                C18478e c18478e3 = c18478eArr[i4];
                int i5 = i;
                while (i5 < i3) {
                    int[] iArr2 = iArr;
                    iArr2[i5] = AbstractC10558e.adcel(((int[]) c18478e2.f36228e)[i5] * ((int[]) c18478e3.f36228e)[i5]);
                    i5++;
                    iArr = iArr2;
                    i3 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                int[] iArr3 = iArr;
                for (int i6 = 0; i6 < i3; i6++) {
                    int[] iArr4 = (int[]) c18478e.f36228e;
                    iArr4[i6] = iArr4[i6] + iArr3[i6];
                }
                i4++;
                iArr = iArr3;
                i = 0;
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.InterfaceC10544e
    /* renamed from: vip */
    public boolean mo2947vip(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC10544e[]) this.f6570e)[i].mo2947vip(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: while, reason: not valid java name */
    public void m1047while() {
        C7744e c7744e = (C7744e) this.f6570e;
        c7744e.getClass();
        if (C7744e.vip.getAndSet(c7744e, EnumC14109e.f27901e) == EnumC14109e.f27902e) {
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        switch (this.f6571e) {
            case 6:
                C18405e c18405e = (C18405e) ((C7988e) this.f6570e).f16176e;
                if (!(th instanceof MediaCodec.CodecException)) {
                    c18405e.ad(0, th.getMessage(), th);
                    return;
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    c18405e.ad(1, codecException.getMessage(), codecException);
                    return;
                }
            default:
                return;
        }
    }
}
