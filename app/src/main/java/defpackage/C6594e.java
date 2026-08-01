package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6594e implements InterfaceC2062e, InterfaceC3232e, InterfaceC16794e, InterfaceC17091e, InterfaceC9483e, InterfaceC9892e, InterfaceC11207e, InterfaceC16700e, NotificationCallback, InterfaceC17342e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6594e f13606e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C6594e f13607e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f13608e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6594e f13609e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static C6594e f13610e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C6594e f13611e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C6594e f13612e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f13613e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13614e;

    static {
        int i = 1;
        f13609e = new C6594e(i, "TINK");
        f13606e = new C6594e(i, "CRUNCHY");
        f13612e = new C6594e(i, "LEGACY");
        f13611e = new C6594e(i, "NO_PREFIX");
    }

    public C6594e(int i) {
        this.f13614e = i;
        switch (i) {
            case 7:
                this.f13613e = new C15681e(new Object());
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f13613e = new C12431e(0, new C9504e[16]);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f13613e = new Bundle();
                return;
            default:
                this.f13613e = r3;
                String[] strArr = {"Other", "Master volume", "Front right", "Front left", "Back right", "Back left", "Front centre", "Back centre", "Subwoofer"};
                return;
        }
    }

    public /* synthetic */ C6594e(int i, Object obj) {
        this.f13614e = i;
        this.f13613e = obj;
    }

    public /* synthetic */ C6594e(int i, boolean z) {
        this.f13614e = i;
    }

    public C6594e(Context context) {
        this.f13614e = 6;
        context.getClass();
        this.f13613e = context;
    }

    public C6594e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f13614e = 15;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13613e = new C12470e(uri, clipDescription, uri2);
        } else {
            this.f13613e = new C0909e(uri, clipDescription, uri2);
        }
    }

    public C6594e(Looper looper) {
        this.f13614e = 2;
        Handler handler = new Handler(looper);
        Looper.getMainLooper();
        this.f13613e = handler;
    }

    public C6594e(CallableC9235e callableC9235e, String str) {
        this.f13614e = 9;
        this.f13613e = callableC9235e;
    }

    public C6594e(C15997e c15997e) {
        this.f13614e = 8;
        Charset charset = AbstractC2930e.ad;
        this.f13613e = c15997e;
        c15997e.vip = this;
    }

    public C6594e(boolean z) {
        this.f13614e = 5;
        this.f13613e = new AtomicBoolean(z);
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public static C0560e m2211e(Callable callable) {
        C8988e c8988e = new C8988e();
        EnumC2663e.f6529e.execute(new RunnableC12554e(callable, c8988e, 4));
        return c8988e.ad;
    }

    /* renamed from: final, reason: not valid java name */
    public static C6594e m2212final() {
        C6594e c6594e;
        synchronized (f13608e) {
            try {
                if (f13610e == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f13610e = new C6594e(handlerThread.getLooper());
                }
                c6594e = f13610e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6594e;
    }

    /* renamed from: finally, reason: not valid java name */
    public static C6594e m2213finally(int i, int i2, int i3) {
        return new C6594e(3, AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    /* renamed from: new, reason: not valid java name */
    public static C6594e m2214new() {
        if (f13607e == null) {
            synchronized (C6594e.class) {
                try {
                    if (f13607e == null) {
                        f13607e = new C6594e(0);
                    }
                } finally {
                }
            }
        }
        return f13607e;
    }

    @Override // defpackage.InterfaceC16700e
    public void adcel(SharedPreferences sharedPreferences, String str, Object obj) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, ((Enum) obj).ordinal());
        edit.apply();
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Set admob() {
        return AbstractC0054e.smaato(this);
    }

    public Boolean billing(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13613e;
        if (sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: catch */
    public /* synthetic */ EnumC13734e mo810catch(C14326e c14326e) {
        return AbstractC0054e.yandex(this, c14326e);
    }

    /* renamed from: const, reason: not valid java name */
    public void m2215const(C4780e c4780e) {
        if (c4780e.vip) {
            return;
        }
        C10379e c10379e = (C10379e) this.f13613e;
        synchronized (((ArrayList) c10379e.f20507e)) {
            ((ArrayList) c10379e.f20507e).remove(c4780e);
        }
    }

    /* renamed from: continue, reason: not valid java name */
    public void m2216continue(int i, String str) {
        ((SharedPreferences) this.f13613e).edit().putInt(str, i).apply();
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: extends */
    public /* synthetic */ boolean mo812extends(C14326e c14326e) {
        return AbstractC0054e.purchase(this, c14326e);
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public void m2217e(String str) {
        ((SharedPreferences) this.f13613e).edit().remove(str).apply();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m2218e(defpackage.C16975e r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.loadAd
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = defpackage.AbstractC8542e.mopub(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r6 = r6.loadAd
            java.lang.String r0 = defpackage.AbstractC9413e.ad
            r6.getClass()
            int r0 = r6.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r6 < r0) goto L81
            goto L7c
        L76:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r6 < r0) goto L81
        L7c:
            int r6 = defpackage.AbstractC0054e.tapsense(r2, r1, r1, r1)
            return r6
        L81:
            int r6 = defpackage.AbstractC0054e.tapsense(r3, r1, r1, r1)
            return r6
        L86:
            int r6 = defpackage.AbstractC0054e.tapsense(r1, r1, r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6594e.m2218e(eٌْٗ):int");
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public void m2219e(String str, String str2) {
        Integer num = (Integer) C3737e.f8321e.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f13613e).putCharSequence(str, str2);
    }

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public void m2220e(int i, Object obj, InterfaceC11969e interfaceC11969e) {
        AbstractC4765e abstractC4765e = (AbstractC4765e) obj;
        C15997e c15997e = (C15997e) this.f13613e;
        c15997e.firebase(i, 2);
        c15997e.m4099interface(abstractC4765e.ad(interfaceC11969e));
        interfaceC11969e.yandex(this, abstractC4765e);
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public void m2221e(CharSequence charSequence, String str) {
        Integer num = (Integer) C3737e.f8321e.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f13613e).putCharSequence(str, charSequence);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public void m2222e(String str, C7434e c7434e) {
        Integer num = (Integer) C3737e.f8321e.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a Rating"));
        }
        ((Bundle) this.f13613e).putParcelable(str, (Parcelable) c7434e.vip());
    }

    /* renamed from: for, reason: not valid java name */
    public void m2223for(String str, boolean z) {
        ((SharedPreferences) this.f13613e).edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f13613e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC17342e
    /* renamed from: goto */
    public void mo350goto(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f13613e;
        if (jArr2 == null) {
            this.f13613e = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 8);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1]) | (jArr[2] ^ jArr3[2]) | (jArr[3] ^ jArr3[3]) | (jArr[4] ^ jArr3[4]) | (jArr[5] ^ jArr3[5]) | (jArr[6] ^ jArr3[6]) | (jArr[7] ^ jArr3[7])) == 0) {
                return;
            }
        }
        AbstractC3149e.license(jArr, ((long[][]) this.f13613e)[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr4 = (long[][]) this.f13613e;
            long[] jArr5 = jArr4[i >> 1];
            long[] jArr6 = jArr4[i];
            long j = jArr5[0];
            long j2 = jArr5[1];
            long j3 = jArr5[2];
            long j4 = jArr5[3];
            long j5 = jArr5[4];
            long j6 = jArr5[5];
            long j7 = jArr5[6];
            long j8 = jArr5[7];
            jArr6[0] = (j << 1) ^ ((j8 >> 63) & 293);
            jArr6[1] = (j2 << 1) | (j >>> 63);
            jArr6[2] = (j3 << 1) | (j2 >>> 63);
            jArr6[3] = (j4 << 1) | (j3 >>> 63);
            jArr6[4] = (j5 << 1) | (j4 >>> 63);
            jArr6[5] = (j6 << 1) | (j5 >>> 63);
            jArr6[6] = (j7 << 1) | (j6 >>> 63);
            jArr6[7] = (j8 << 1) | (j7 >>> 63);
            AbstractC3149e.ad(jArr6, jArr4[1], jArr4[i + 1]);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public Iterator m2224import(C0381e c0381e, CharSequence charSequence) {
        return new C12888e(this, c0381e, charSequence);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Set inmobi(C14326e c14326e) {
        return AbstractC0054e.startapp(this, c14326e);
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 8;
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: interface, reason: not valid java name */
    public void mo2225interface(String str) {
        C9674e c9674e = (C9674e) this.f13613e;
        c9674e.purchase(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = AbstractC13517e.ad;
            if (charAt < strArr.length && strArr[charAt] != null) {
                c9674e.mo2632return(i, i2, str);
                String str2 = strArr[charAt];
                c9674e.mo2632return(0, str2.length(), str2);
                i = i2 + 1;
            }
        }
        c9674e.mo2632return(i, str.length(), str);
        c9674e.purchase(34);
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        C13827e c13827e = (C13827e) obj;
        C4594e c4594e = ((CallableC9235e) this.f13613e).appmetrica;
        if (c13827e != null) {
            return AbstractC1749e.yandex(Arrays.asList(C4594e.ad(c4594e), c4594e.smaato.signatures(null, (ExecutorC4614e) c4594e.appmetrica.f25751e)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return AbstractC1749e.appmetrica(null);
    }

    @Override // defpackage.InterfaceC9892e
    public Object license(Object obj, Object obj2) {
        return ((InterfaceC8223e) this.f13613e).apply(obj2);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ void metrica(C11565e c11565e) {
        AbstractC0054e.billing(this, c11565e);
    }

    @Override // defpackage.InterfaceC9729e
    public InterfaceC12330e mopub() {
        return C17015e.f33328e;
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C0912e c0912e = (C0912e) this.f13613e;
        int i = AbstractC6026e.ad;
        c0912e.smaato(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    /* renamed from: package, reason: not valid java name */
    public Integer m2226package(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13613e;
        if (sharedPreferences.contains(str)) {
            return Integer.valueOf(sharedPreferences.getInt(str, 0));
        }
        return null;
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object premium(C14326e c14326e, EnumC13734e enumC13734e) {
        return AbstractC0054e.admob(this, c14326e, enumC13734e);
    }

    @Override // defpackage.InterfaceC17342e
    public void pro(long[] jArr) {
        long[] jArr2 = new long[8];
        AbstractC3149e.license(((long[][]) this.f13613e)[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i = 62; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = jArr2[4];
            long j6 = jArr2[5];
            long j7 = jArr2[6];
            long j8 = jArr2[7];
            long j9 = j8 >>> 56;
            jArr2[0] = ((((j << 8) ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 8);
            jArr2[1] = (j2 << 8) | (j >>> 56);
            jArr2[2] = (j3 << 8) | (j2 >>> 56);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            jArr2[4] = (j5 << 8) | (j4 >>> 56);
            jArr2[5] = (j6 << 8) | (j5 >>> 56);
            jArr2[6] = (j7 << 8) | (j6 >>> 56);
            jArr2[7] = (j8 << 8) | (j7 >>> 56);
            AbstractC3149e.ad(((long[][]) this.f13613e)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        AbstractC3149e.license(jArr2, jArr);
    }

    /* renamed from: public, reason: not valid java name */
    public void m2227public(long j, String str) {
        Integer num = (Integer) C3737e.f8321e.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f13613e).putLong(str, j);
    }

    @Override // defpackage.InterfaceC17091e
    public void purchase(Object obj) {
        Map map = (Map) obj;
        AbstractC15958e abstractC15958e = (AbstractC15958e) this.f13613e;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        C13188e c13188e = (C13188e) abstractC15958e.f31418class.pollFirst();
        if (c13188e == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = c13188e.f26193e;
            if (abstractC15958e.metrica.applovin(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object smaato(C14326e c14326e, Object obj) {
        return AbstractC0054e.Signature(this, c14326e, obj);
    }

    @Override // defpackage.InterfaceC9483e
    public void subs(char c) {
        ((C9674e) this.f13613e).purchase(c);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object subscription(C14326e c14326e) {
        return AbstractC0054e.loadAd(this, c14326e);
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: this, reason: not valid java name */
    public void mo2228this(String str) {
        ((C9674e) this.f13613e).mo2631private(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌۧۦ, java.lang.Object] */
    /* renamed from: throws, reason: not valid java name */
    public C9142e m2229throws(C14391e c14391e) {
        final ?? obj = new Object();
        obj.license = new ArrayList();
        obj.appmetrica = new ArrayList();
        obj.metrica = this;
        ((ArrayList) this.f13613e).add(obj);
        C8705e c8705e = new C8705e(5, false);
        c8705e.f17570e = 0.0f;
        C18051e c18051e = new C18051e(c8705e);
        c18051e.adcel = 0.001f;
        obj.vip = c18051e;
        C2326e c2326e = new C2326e();
        c2326e.vip(c14391e.ad);
        c2326e.ad(c14391e.vip);
        c18051e.smaato = c2326e;
        InterfaceC17484e interfaceC17484e = new InterfaceC17484e() { // from class: eٕٝؖ
            @Override // defpackage.InterfaceC17484e
            public final void yandex(float f) {
                C9142e c9142e = C9142e.this;
                c9142e.ad = f;
                Iterator it = ((ArrayList) c9142e.appmetrica).iterator();
                while (it.hasNext()) {
                    ((InterfaceC7781e) it.next()).ad(c9142e);
                }
            }
        };
        if (c18051e.purchase) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = c18051e.advert;
        if (!arrayList.contains(interfaceC17484e)) {
            arrayList.add(interfaceC17484e);
        }
        C13154e c13154e = new C13154e(obj);
        ArrayList arrayList2 = c18051e.mopub;
        if (!arrayList2.contains(c13154e)) {
            arrayList2.add(c13154e);
        }
        return obj;
    }

    public String toString() {
        switch (this.f13614e) {
            case 1:
                return (String) this.f13613e;
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m2230transient() {
        int i = AbstractC3521e.ad;
        if (((C17015e) mopub()).smaato(InterfaceC3232e.appmetrica, null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.InterfaceC11207e
    public ByteBuffer vip() {
        return (ByteBuffer) this.f13613e;
    }

    /* renamed from: volatile, reason: not valid java name */
    public void m2231volatile(String str, Bitmap bitmap) {
        Integer num = (Integer) C3737e.f8321e.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f13613e).putParcelable(str, bitmap);
    }

    @Override // defpackage.InterfaceC9483e
    public void writeLong(long j) {
        mo2228this(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC16700e
    public Object yandex(SharedPreferences sharedPreferences, String str, Object obj) {
        return ((Enum[]) this.f13613e)[sharedPreferences.getInt(str, ((Enum) obj).ordinal())];
    }
}
