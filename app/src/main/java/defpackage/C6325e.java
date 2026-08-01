package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.profileinstaller.ProfileInstallReceiver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6325e implements InterfaceC16794e, InterfaceC16733e, InterfaceC17091e, InterfaceC11628e, InterfaceC15254e, InterfaceC11207e, InterfaceC4732e, NotificationCallback, InterfaceC12233e, InterfaceC17342e, InterfaceC1133e, InterfaceC2295e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6325e f13163e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C6325e f13164e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C6325e f13165e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6325e f13166e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C13474e f13167e = new C13474e(1);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C6325e f13168e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C6325e f13169e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f13170e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13171e;

    static {
        int i = 1;
        f13166e = new C6325e(i, "SHA1");
        f13163e = new C6325e(i, "SHA224");
        f13169e = new C6325e(i, "SHA256");
        f13168e = new C6325e(i, "SHA384");
        f13165e = new C6325e(i, "SHA512");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eْۢٛ, java.lang.Object] */
    public C6325e(byte b, int i) {
        InterfaceC12111e interfaceC12111e;
        this.f13171e = i;
        switch (i) {
            case 2:
                C5623e c5623e = C5623e.metrica;
                try {
                    interfaceC12111e = (InterfaceC12111e) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC12111e = f13167e;
                }
                InterfaceC12111e[] interfaceC12111eArr = {C13474e.vip, interfaceC12111e};
                ?? obj = new Object();
                obj.ad = interfaceC12111eArr;
                Charset charset = AbstractC0352e.ad;
                this.f13170e = obj;
                return;
            case 4:
                this.f13170e = new AtomicBoolean(false);
                return;
            case 10:
                this.f13170e = new TreeSet(AbstractC7640e.ad);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f13170e = new Bundle();
                return;
            case 21:
                this.f13170e = Build.VERSION.SDK_INT >= 28 ? new Object() : new C10659e(6);
                return;
            default:
                this.f13170e = new HashSet();
                return;
        }
    }

    public /* synthetic */ C6325e(char c, int i) {
        this.f13171e = i;
    }

    public C6325e(int i) {
        this.f13171e = 25;
        this.f13170e = new ArrayList(i);
    }

    public /* synthetic */ C6325e(int i, Object obj) {
        this.f13171e = i;
        this.f13170e = obj;
    }

    public C6325e(MediaMetadataCompat mediaMetadataCompat) {
        this.f13171e = 19;
        Bundle bundle = new Bundle(mediaMetadataCompat.f25e);
        this.f13170e = bundle;
        C12894e.subscription(bundle);
    }

    public C6325e(byte[] bArr) {
        this.f13171e = 15;
        if (!AbstractC1786e.adcel(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f13170e = AbstractC0613e.vip(bArr);
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e Signature(C8268e c8268e) {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e ad(List list) {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e adcel() {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e admob() {
        return this;
    }

    public void ads(C13915e c13915e) {
        if (!c13915e.m3708extends()) {
            AbstractC14070e.metrica("DepthSortedSet.add called on an unattached node");
        }
        ((C5721e) this.f13170e).add(c13915e);
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e advert() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.InterfaceC1133e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable amazon(defpackage.AbstractC10731e r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6325e.amazon(eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e applovin() {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e appmetrica(C16169e c16169e) {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e billing() {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16528e build() {
        return (C13081e) this.f13170e;
    }

    /* renamed from: class, reason: not valid java name */
    public void m2151class(String str, String str2) {
        C2271e c2271e = MediaMetadataCompat.f20e;
        if (c2271e.containsKey(str) && ((Integer) c2271e.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f13170e).putCharSequence(str, str2);
    }

    public byte[] crashlytics(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec ad = AbstractC0613e.ad(0, bArr.length, bArr);
        Cipher metrica = AbstractC0613e.metrica();
        metrica.init(1, (SecretKeySpec) this.f13170e, ad);
        if (bArr3 != null && bArr3.length != 0) {
            metrica.updateAAD(bArr3);
        }
        int outputSize = metrica.getOutputSize(bArr2.length);
        if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i + outputSize];
        if (metrica.doFinal(bArr2, 0, bArr2.length, bArr4, i) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public Set firebase() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f13170e)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f13170e);
        }
        return unmodifiableSet;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C17438e(Integer.valueOf(C17438e.f34156e).intValue(), (Context) ((InterfaceC16964e) this.f13170e).get(), "com.google.android.datatransport.events");
    }

    @Override // defpackage.InterfaceC17342e
    /* renamed from: goto */
    public void mo350goto(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f13170e;
        if (jArr2 == null) {
            this.f13170e = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1])) == 0) {
                return;
            }
        }
        long[] jArr4 = ((long[][]) this.f13170e)[1];
        jArr4[0] = jArr[0];
        jArr4[1] = jArr[1];
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr5 = (long[][]) this.f13170e;
            long[] jArr6 = jArr5[i >> 1];
            long[] jArr7 = jArr5[i];
            long j = jArr6[0];
            long j2 = jArr6[1];
            long j3 = ((j2 >> 63) & 135) ^ (j << 1);
            jArr7[0] = j3;
            long j4 = (j >>> 63) | (j2 << 1);
            jArr7[1] = j4;
            long[] jArr8 = jArr5[1];
            long[] jArr9 = jArr5[i + 1];
            jArr9[0] = jArr8[0] ^ j3;
            jArr9[1] = j4 ^ jArr8[1];
        }
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e inmobi(C0520e c0520e) {
        return this;
    }

    /* renamed from: interface, reason: not valid java name */
    public boolean m2152interface(C13915e c13915e) {
        if (!c13915e.m3708extends()) {
            AbstractC14070e.metrica("DepthSortedSet.remove called on an unattached node");
        }
        return ((C5721e) this.f13170e).remove(c13915e);
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e isPro(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        C13827e c13827e = (C13827e) obj;
        C13391e c13391e = (C13391e) this.f13170e;
        if (c13827e == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return AbstractC1749e.appmetrica(null);
        }
        C4594e c4594e = (C4594e) c13391e.f26644e;
        C4594e.ad(c4594e);
        c4594e.smaato.signatures(null, (ExecutorC4614e) c4594e.appmetrica.f25751e);
        c4594e.admob.license(null);
        return AbstractC1749e.appmetrica(null);
    }

    @Override // defpackage.InterfaceC2295e
    public /* bridge */ /* synthetic */ void license(Object obj) {
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e loadAd(InterfaceC2460e interfaceC2460e) {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e metrica(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC4732e
    public void mopub(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.FLAVOR;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f13170e).setResultCode(i);
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C0912e c0912e = (C0912e) this.f13170e;
        int i = AbstractC6026e.ad;
        c0912e.smaato(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    public void premium(Object obj) {
        ((ArrayList) this.f13170e).add(obj);
    }

    @Override // defpackage.InterfaceC17342e
    public void pro(long[] jArr) {
        long[] jArr2 = ((long[][]) this.f13170e)[((int) (jArr[1] >>> 56)) & 255];
        long[] jArr3 = {jArr2[0], jArr2[1]};
        for (int i = 14; i >= 0; i--) {
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = j2 >>> 56;
            long j4 = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
            jArr3[0] = j4;
            long j5 = (j >>> 56) | (j2 << 8);
            jArr3[1] = j5;
            long[] jArr4 = ((long[][]) this.f13170e)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255];
            jArr3[0] = jArr4[0] ^ j4;
            jArr3[1] = j5 ^ jArr4[1];
        }
        jArr[0] = jArr3[0];
        jArr[1] = jArr3[1];
    }

    @Override // defpackage.InterfaceC17091e
    public void purchase(Object obj) {
        C13381e c13381e = (C13381e) obj;
        AbstractC15958e abstractC15958e = (AbstractC15958e) this.f13170e;
        C13188e c13188e = (C13188e) abstractC15958e.f31418class.pollLast();
        if (c13188e == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = c13188e.f26193e;
        int i = c13188e.f26192e;
        AbstractComponentCallbacksC17875e applovin = abstractC15958e.metrica.applovin(str);
        if (applovin != null) {
            applovin.admob(i, c13381e.f26639e, c13381e.f26638e);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e remoteconfig(AbstractC1186e abstractC1186e) {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e signatures() {
        return this;
    }

    @Override // defpackage.InterfaceC11628e
    public Iterable smaato(Object obj) {
        C18214e c18214e = (C18214e) this.f13170e;
        Collection ad = ((InterfaceC5052e) obj).mo1459goto().ad();
        ArrayList arrayList = new ArrayList();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            InterfaceC4077e advert = ((AbstractC1186e) it.next()).loadAd().advert();
            C10184e c10184e = null;
            InterfaceC4077e vip = advert != null ? advert.vip() : null;
            InterfaceC5052e interfaceC5052e = vip instanceof InterfaceC5052e ? (InterfaceC5052e) vip : null;
            if (interfaceC5052e != null && (c10184e = c18214e.vip(interfaceC5052e)) == null) {
                c10184e = interfaceC5052e;
            }
            if (c10184e != null) {
                arrayList.add(c10184e);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC4732e
    public void startapp() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void subs(Object obj) {
        ArrayList arrayList = (ArrayList) this.f13170e;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC16733e
    public InterfaceC16733e tapsense(InterfaceC15498e interfaceC15498e) {
        return this;
    }

    public String toString() {
        switch (this.f13171e) {
            case 1:
                return (String) this.f13170e;
            case 10:
                return ((C5721e) this.f13170e).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11207e
    public ByteBuffer vip() {
        return (ByteBuffer) this.f13170e;
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        AbstractC9464e.pro("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        ((C2245e) this.f13170e).startapp();
    }
}
