package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6029e implements InterfaceC7046e, InterfaceC17771e, InterfaceC12233e, InterfaceC2295e, InterfaceC11455e, InterfaceC4629e, InterfaceC17847e, InterfaceC17533e, InterfaceC5000e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static C6029e f12697e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f12698e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f12699e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f12700e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12701e;

    public C6029e(byte b, int i) {
        this.f12701e = i;
        switch (i) {
            case 9:
                this.f12699e = new WeakHashMap();
                this.f12698e = new WeakHashMap();
                this.f12700e = new WeakHashMap();
                return;
            case 10:
            case 11:
            default:
                return;
            case 12:
                this.f12699e = new C6354e(BuildConfig.FLAVOR, 0L, null);
                this.f12698e = new C6354e(BuildConfig.FLAVOR, 0L, null);
                this.f12700e = new ArrayList();
                return;
            case 13:
                this.f12699e = new HashMap();
                this.f12698e = new HashMap();
                this.f12700e = C11373e.metrica;
                return;
        }
    }

    public C6029e(int i) {
        this.f12701e = 7;
        this.f12699e = i != 1 ? new C4662e(i) : null;
    }

    public /* synthetic */ C6029e(int i, Object obj, Object obj2, Object obj3) {
        this.f12701e = i;
        this.f12699e = obj;
        this.f12698e = obj2;
        this.f12700e = obj3;
    }

    public C6029e(Context context, C6936e c6936e) {
        this.f12701e = 15;
        this.f12700e = new AtomicLong(-1L);
        this.f12698e = new AbstractC6950e(context, C4480e.advert, new C16172e("measurement:api"), C16258e.metrica);
        this.f12699e = c6936e;
    }

    public C6029e(AbstractServiceC5667e abstractServiceC5667e) {
        this.f12701e = 4;
        this.f12699e = new C4891e(abstractServiceC5667e, true);
        this.f12698e = new Handler(Looper.getMainLooper());
    }

    public C6029e(C6354e c6354e) {
        this.f12701e = 12;
        this.f12699e = c6354e;
        this.f12698e = c6354e.clone();
        this.f12700e = new ArrayList();
    }

    public /* synthetic */ C6029e(C8130e c8130e, String str, C2580e c2580e, C4681e c4681e) {
        this.f12701e = 14;
        this.f12699e = str;
        this.f12698e = c2580e;
        this.f12700e = c4681e;
    }

    public C6029e(C15398e c15398e, String str, ArrayList arrayList) {
        this.f12701e = 17;
        this.f12699e = str;
        this.f12698e = arrayList;
        this.f12700e = c15398e;
    }

    public C6029e(ArrayList arrayList) {
        this.f12701e = 11;
        this.f12699e = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f12698e = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C16743e c16743e = (C16743e) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f12698e;
            jArr[i2] = c16743e.vip;
            jArr[i2 + 1] = c16743e.metrica;
        }
        long[] jArr2 = (long[]) this.f12698e;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f12700e = copyOf;
        Arrays.sort(copyOf);
    }

    public C6029e(SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity, C10838e c10838e) {
        this.f12701e = 5;
        this.f12699e = smallPlayerGlanceConfigurationActivity;
        this.f12698e = c10838e;
        new C1890e(smallPlayerGlanceConfigurationActivity);
        this.f12700e = AbstractC14533e.startapp(EnumC14727e.RECOMMENDATIONS);
    }

    public static C6029e subscription(C8070e c8070e) {
        C6029e c6029e = new C6029e((byte) 0, 0);
        c6029e.f12699e = c8070e.ad;
        c6029e.f12698e = c8070e.vip;
        c6029e.f12700e = c8070e.metrica;
        return c6029e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eۖؒ, eٍُؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC17771e
    public InterfaceC10898e Signature(InterfaceC16186e interfaceC16186e) {
        C15708e c15708e = (C15708e) this.f12699e;
        byte[] bArr = (byte[]) this.f12700e;
        byte[] bArr2 = (byte[]) this.f12698e;
        ?? obj = new Object();
        if (256 > ((Integer) AbstractC3874e.ad.get("SHA-512")).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (interfaceC16186e.entropySize() < 256) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        obj.f35756e = c15708e;
        obj.f35752e = interfaceC16186e;
        obj.f35758e = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        int intValue = ((Integer) C18289e.f35751e.get("SHA-512")).intValue();
        obj.f35757e = intValue;
        byte[] entropy = interfaceC16186e.getEntropy();
        if (entropy.length < (PSKKeyManager.MAX_KEY_LENGTH_BYTES + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] ad = AbstractC3874e.ad(c15708e, AbstractC12442e.mopub(entropy, bArr2, bArr), intValue);
        obj.f35754e = ad;
        byte[] bArr3 = new byte[ad.length + 1];
        System.arraycopy(ad, 0, bArr3, 1, ad.length);
        obj.f35753e = AbstractC3874e.ad(c15708e, bArr3, intValue);
        obj.f35755e = 1L;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eَؗٔ, java.lang.Object] */
    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C7971e c7971e = (C7971e) obj;
        C4627e c4627e = new C4627e((C8988e) obj2);
        String str = (String) this.f12699e;
        C2580e c2580e = (C2580e) this.f12698e;
        C4681e c4681e = (C4681e) this.f12700e;
        c7971e.getClass();
        BinderC1751e binderC1751e = new BinderC1751e(c2580e);
        c7971e.f16144goto.add(binderC1751e);
        C11125e c11125e = (C11125e) c7971e.loadAd();
        ?? obj3 = new Object();
        obj3.f10372e = new BinderC6435e(c4627e);
        obj3.f10368e = str;
        obj3.f10371e = "vkx_cdcm";
        obj3.f10374e = c4681e;
        obj3.f10373e = binderC1751e;
        Parcel m4156e = c11125e.m4156e();
        int i = AbstractC0923e.ad;
        m4156e.writeInt(1);
        obj3.writeToParcel(m4156e, 0);
        c11125e.m4153e(m4156e, 2001);
    }

    @Override // defpackage.InterfaceC8559e
    public C12916e ad() {
        return ((InterfaceC7046e) this.f12700e).ad();
    }

    @Override // defpackage.InterfaceC11455e
    public long adcel(int i) {
        long[] jArr = (long[]) this.f12700e;
        AbstractC2301e.billing(i >= 0);
        AbstractC2301e.billing(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.InterfaceC8559e
    public boolean admob() {
        return ((InterfaceC7046e) this.f12700e).admob();
    }

    @Override // defpackage.InterfaceC11455e
    public List advert(long j) {
        List list = (List) this.f12699e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f12698e;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C16743e c16743e = (C16743e) list.get(i);
                C17817e c17817e = c16743e.ad;
                if (c17817e.appmetrica == -3.4028235E38f) {
                    arrayList2.add(c16743e);
                } else {
                    arrayList.add(c17817e);
                }
            }
        }
        Collections.sort(arrayList2, new C6575e(27));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C17817e c17817e2 = ((C16743e) arrayList2.get(i3)).ad;
            arrayList.add(new C17817e(c17817e2.ad, c17817e2.vip, c17817e2.metrica, c17817e2.license, (-1) - i3, 1, c17817e2.billing, c17817e2.yandex, c17817e2.startapp, c17817e2.amazon, c17817e2.loadAd, c17817e2.adcel, c17817e2.mopub, c17817e2.advert, c17817e2.smaato, c17817e2.Signature, c17817e2.admob, c17817e2.subscription));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC7046e
    public C13886e amazon() {
        return (C13886e) this.f12698e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    @Override // defpackage.InterfaceC17533e, defpackage.InterfaceC5000e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appmetrica(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6029e.appmetrica(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // defpackage.InterfaceC8559e
    public void billing(C2394e c2394e) {
        ((InterfaceC7046e) this.f12700e).billing(c2394e);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f12701e) {
            case 12:
                C6029e c6029e = new C6029e(((C6354e) this.f12699e).clone());
                Iterator it = ((ArrayList) this.f12700e).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c6029e.f12700e).add(((C6354e) it.next()).clone());
                }
                return c6029e;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f12701e) {
            case 3:
                return new C12894e(21, (Context) ((InterfaceC16964e) this.f12699e).get(), (InterfaceC8685e) ((InterfaceC16964e) this.f12698e).get(), (C6176e) ((C10659e) this.f12700e).get());
            default:
                int i = 12;
                return new C6553e(new C7936e(i), new C14595e(i), (InterfaceC6963e) ((C18464e) this.f12699e).get(), (C4956e) ((C14461e) this.f12698e).get(), (C11106e) ((C11980e) this.f12700e).get());
        }
    }

    @Override // defpackage.InterfaceC17771e
    public String getAlgorithm() {
        return "HASH-DRBG-" + AbstractC9386e.ad((C15708e) this.f12699e);
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        AbstractC15792e.amazon(true, (ListenableFuture) this.f12699e, (C7169e) this.f12698e, AbstractC3062e.billing());
    }

    @Override // defpackage.InterfaceC11455e
    public int loadAd() {
        return ((long[]) this.f12700e).length;
    }

    @Override // defpackage.InterfaceC8559e
    public InterfaceC6141e metrica() {
        return (C18325e) this.f12699e;
    }

    @Override // defpackage.InterfaceC8559e
    public boolean mopub() {
        return ((InterfaceC7046e) this.f12700e).mopub();
    }

    public void pro(EnumC14621e enumC14621e) {
        RunnableC4611e runnableC4611e = (RunnableC4611e) this.f12700e;
        if (runnableC4611e != null) {
            runnableC4611e.run();
        }
        RunnableC4611e runnableC4611e2 = new RunnableC4611e((C4891e) this.f12699e, enumC14621e);
        this.f12700e = runnableC4611e2;
        ((Handler) this.f12698e).postAtFrontOfQueue(runnableC4611e2);
    }

    @Override // defpackage.InterfaceC11455e
    public int purchase(long j) {
        long[] jArr = (long[]) this.f12700e;
        int vip = AbstractC9413e.vip(jArr, j, false);
        if (vip < jArr.length) {
            return vip;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remoteconfig(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C5595e
            if (r0 == 0) goto L13
            r0 = r5
            eؘِۦ r0 = (defpackage.C5595e) r0
            int r1 = r0.f11948e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11948e = r1
            goto L18
        L13:
            eؘِۦ r0 = new eؘِۦ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11946e
            int r1 = r0.f11948e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؘۤۖ r0 = r0.f11947e
            defpackage.AbstractC2003e.purchase(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Object r5 = r4.f12699e
            ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity r5 = (ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity) r5
            eؘٙ۟ r1 = defpackage.C5717e.metrica
            java.lang.Object r3 = r4.f12698e
            eؘُٜ r3 = (defpackage.C10838e) r3
            r0.f11947e = r4
            r0.f11948e = r2
            eٖۧۦ r2 = defpackage.C16669e.ad
            int r3 = r3.ad
            java.lang.String r3 = defpackage.AbstractC14114e.vip(r3)
            java.lang.Object r5 = r2.metrica(r5, r1, r3, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L51
            return r0
        L51:
            r0 = r4
        L52:
            eْٛ r5 = (defpackage.C13355e) r5
            eٔٔۤ r5 = r5.f26610e
            java.lang.Object r0 = r0.f12700e
            eؑۜٝ r0 = (defpackage.C0576e) r0
            r0.setValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6029e.remoteconfig(eُؑ۠):java.lang.Object");
    }

    public synchronized void signatures(int i, int i2, long j, long j2) {
        ((C6936e) this.f12699e).f14215e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f12700e;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((C4480e) this.f12698e).billing(new C11075e(0, Arrays.asList(new C11632e(36301, i, 0, j, j2, null, null, 0, i2)))).metrica(new C3318e(this, elapsedRealtime, 8));
    }

    @Override // defpackage.InterfaceC8559e
    public C2394e smaato() {
        return ((InterfaceC7046e) this.f12700e).smaato();
    }

    @Override // defpackage.InterfaceC4629e
    public /* bridge */ /* synthetic */ InterfaceC4629e startapp(Class cls, InterfaceC1848e interfaceC1848e) {
        ((HashMap) this.f12699e).put(cls, interfaceC1848e);
        ((HashMap) this.f12698e).remove(cls);
        return this;
    }

    @Override // defpackage.InterfaceC8559e
    public C9348e vip() {
        return ((InterfaceC7046e) this.f12700e).vip();
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        C7169e c7169e = (C7169e) this.f12698e;
        if (th instanceof CancellationException) {
            AbstractC4265e.yandex(null, c7169e.metrica(new RuntimeException(AbstractC1786e.signatures(new StringBuilder(), (String) this.f12700e, " cancelled."), th)));
        } else {
            c7169e.ad(null);
        }
    }
}
