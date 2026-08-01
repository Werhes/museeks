package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.preference.PreferenceManager;
import android.util.SparseArray;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10312e implements InterfaceC14187e, InterfaceC15989e, InterfaceC12006e, InterfaceC9250e, InterfaceC15169e, InterfaceC14343e, InterfaceC2295e, InterfaceC7429e, InterfaceC17556e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f20360e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f20361e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20362e;

    public C10312e(int i) {
        this.f20362e = i;
        switch (i) {
            case 7:
                this.f20361e = new C0583e();
                this.f20360e = new C0583e();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f20361e = new ConcurrentHashMap();
                this.f20360e = new AtomicInteger(0);
                return;
            default:
                Float valueOf = Float.valueOf(0.0f);
                C11139e c11139e = AbstractC9546e.ad;
                this.f20360e = new C16747e(c11139e, valueOf, (AbstractC3424e) c11139e.ad.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    public /* synthetic */ C10312e(int i, boolean z) {
        this.f20362e = i;
    }

    public C10312e(Context context, int i) {
        this.f20362e = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f20361e = new C17221e();
                this.f20360e = context.getPackageManager();
                return;
            default:
                this.f20360e = null;
                this.f20361e = context;
                return;
        }
    }

    public C10312e(Context context, String str, String str2) {
        this.f20362e = 19;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f20361e = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f20360e = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f20360e = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public C10312e(Handler handler, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e) {
        this.f20362e = 25;
        if (surfaceHolderCallbackC0960e != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f20361e = handler;
        this.f20360e = surfaceHolderCallbackC0960e;
    }

    public C10312e(WorkDatabase workDatabase) {
        this.f20362e = 11;
        this.f20361e = workDatabase;
        this.f20360e = new C3606e(workDatabase, 1);
    }

    public C10312e(C1993e c1993e) {
        this.f20362e = 12;
        this.f20360e = c1993e;
    }

    public C10312e(C4275e c4275e, Looper looper) {
        this.f20362e = 4;
        this.f20360e = c4275e;
        this.f20361e = new Handler(looper, new C3275e(1, this));
    }

    public C10312e(C7755e c7755e) {
        this.f20362e = 10;
        this.f20361e = c7755e;
        this.f20360e = new C16330e(-1);
    }

    public /* synthetic */ C10312e(Object obj, Object obj2, int i) {
        this.f20362e = i;
        this.f20361e = obj;
        this.f20360e = obj2;
    }

    public /* synthetic */ C10312e(Object obj, Object obj2, boolean z, int i) {
        this.f20362e = i;
        this.f20360e = obj;
        this.f20361e = obj2;
    }

    public C10312e(String str) {
        this.f20362e = 0;
        this.f20361e = str;
        this.f20360e = new ArrayList(0);
        InterfaceC14256e.ad.getClass();
        List ad = C12381e.ad();
        new ArrayList();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC14256e) it.next()).getClass();
        }
    }

    public static C6557e amazon(List list) {
        return list.isEmpty() ? C6557e.f13491e : new C6557e(list);
    }

    public static C14072e premium(C5790e c5790e) {
        ByteBuffer allocate = ByteBuffer.allocate(188);
        int position = allocate.position();
        while (c5790e.read(allocate) != -1 && allocate.hasRemaining()) {
        }
        if (allocate.position() - position != 188) {
            return null;
        }
        allocate.flip();
        if (71 != (allocate.get() & 255)) {
            throw new IllegalStateException();
        }
        int i = allocate.getShort() & 8191;
        byte b = allocate.get();
        if ((b & 32) != 0) {
            AbstractC2835e.metrica(allocate.get() & 255, allocate);
        }
        if ((b & 16) == 0) {
            allocate = null;
        }
        C14072e c14072e = new C14072e();
        c14072e.f27819e = i;
        c14072e.f27820e = allocate;
        return c14072e;
    }

    public static C18100e purchase() {
        C18100e c18100e = new C18100e(3);
        c18100e.f35490e = true;
        return c18100e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory Signature(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10312e.Signature(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // defpackage.InterfaceC7429e
    public void ad() {
        C17974e c17974e = (C17974e) this.f20360e;
        C7431e c7431e = (C7431e) this.f20361e;
        SparseArray sparseArray = (SparseArray) c17974e.f35233e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove(c7431e) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.InterfaceC12006e
    public /* synthetic */ void adcel(InterfaceC15671e interfaceC15671e) {
    }

    public int admob(String str) {
        int i;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f20361e;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    int andIncrement = ((AtomicInteger) this.f20360e).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                    i = andIncrement;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public void ads(byte[] bArr) {
        long[] jArr = ((long[][]) this.f20360e)[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = ((long[][]) this.f20360e)[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        AbstractC3628e.admob(0, j, bArr);
        AbstractC3628e.admob(8, j2, bArr);
    }

    @Override // defpackage.InterfaceC12006e
    public /* synthetic */ C4988e advert() {
        return null;
    }

    @Override // defpackage.InterfaceC7429e
    public int applovin(int i) {
        C7431e c7431e = (C7431e) this.f20361e;
        C17974e c17974e = (C17974e) this.f20360e;
        List list = (List) ((SparseArray) c17974e.f35233e).get(i);
        if (list == null) {
            list = new ArrayList();
            ((SparseArray) c17974e.f35233e).put(i, list);
        }
        if (!list.contains(c7431e)) {
            list.add(c7431e);
        }
        return i;
    }

    @Override // defpackage.InterfaceC15989e
    public boolean appmetrica() {
        return ((InterfaceC15989e) this.f20361e).appmetrica();
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture billing(C12053e c12053e) {
        ListenableFuture billing = ((InterfaceC14343e) this.f20361e).billing(c12053e);
        if (billing == null) {
            return null;
        }
        return AbstractC2017e.purchase(billing, new C11399e(2, this), EnumC3320e.f7489e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: class, reason: not valid java name */
    public void m2794class(float f, InterfaceC14388e interfaceC14388e, InterfaceC18435e interfaceC18435e) {
        if (f <= interfaceC14388e.mo497instanceof(AbstractC1469e.ad)) {
            return;
        }
        AbstractC13717e adcel = AbstractC12640e.adcel();
        InterfaceC5083e interfaceC5083e = null;
        Object[] objArr = 0;
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            float floatValue = ((Number) ((C16747e) this.f20360e).f32835e.getValue()).floatValue();
            C8419e c8419e = (C8419e) this.f20361e;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            C16747e c16747e = (C16747e) this.f20360e;
            if (c16747e.f32838e) {
                this.f20360e = AbstractC1284e.vip(c16747e, floatValue - f, 0.0f, 30);
            } else {
                this.f20360e = new C16747e(AbstractC9546e.ad, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.f20361e = AbstractC5336e.purchase(interfaceC18435e, null, 0, new C16600e(this, interfaceC5083e, 14), 3);
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    public void crashlytics(int i) {
        ((C16330e) this.f20360e).startapp(i);
    }

    public void firebase() {
        C8419e c8419e = (C8419e) this.f20361e;
        AbstractC3424e abstractC3424e = null;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f20360e = new C16747e(AbstractC9546e.ad, Float.valueOf(0.0f), abstractC3424e, 60);
    }

    /* renamed from: goto, reason: not valid java name */
    public void m2795goto(C2351e c2351e) {
        Handler handler = (Handler) this.f20361e;
        if (handler != null) {
            handler.post(new RunnableC11247e(this, c2351e, 18));
        }
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
        Object obj;
        C13578e c13578e = (C13578e) this.f20360e;
        if (c13578e.ads()) {
            return;
        }
        C10017e c10017e = (C10017e) this.f20361e;
        if (iOException instanceof C11495e) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message == null || !AbstractC5304e.inmobi(message, "connect", true)) {
                iOException = AbstractC4173e.ad(c10017e, iOException);
            } else {
                int i = AbstractC4173e.ad;
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append((C6399e) c10017e.f19786e);
                sb.append(", connect_timeout=");
                C10794e c10794e = (C10794e) c10017e.vip();
                if (c10794e == null || (obj = c10794e.vip) == null) {
                    obj = "unknown";
                }
                sb.append(obj);
                sb.append(" ms]");
                iOException = new C12694e(sb.toString(), iOException);
            }
        }
        c13578e.billing(new C12763e(iOException));
    }

    /* renamed from: interface, reason: not valid java name */
    public void m2796interface(AbstractC14546e abstractC14546e) {
        C0583e c0583e = (C0583e) this.f20361e;
        Object billing = ((C0583e) this.f20360e).billing(abstractC14546e);
        if (billing != null) {
            if (!(billing instanceof C12328e)) {
                throw new ClassCastException();
            }
            C12328e c12328e = (C12328e) billing;
            Object[] objArr = c12328e.ad;
            int i = c12328e.vip;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    throw new ClassCastException();
                }
                C3685e c3685e = new C3685e(abstractC14546e);
                Object billing2 = c0583e.billing(null);
                if (billing2 != null) {
                    if (billing2 instanceof C12328e) {
                        C12328e c12328e2 = (C12328e) billing2;
                        int i3 = c12328e2.vip;
                        Object[] objArr2 = c12328e2.ad;
                        int i4 = 0;
                        C15926e admob = AbstractC3062e.admob(0, i3);
                        int i5 = admob.f22523e;
                        int i6 = admob.f22522e;
                        if (i5 <= i6) {
                            while (true) {
                                objArr2[i5 - i4] = objArr2[i5];
                                if (((Boolean) c3685e.invoke(objArr2[i5])).booleanValue()) {
                                    i4++;
                                }
                                if (i5 == i6) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Arrays.fill(objArr2, i3 - i4, i3, (Object) null);
                        c12328e2.vip -= i4;
                        if (c12328e2.adcel()) {
                            c0583e.advert(null);
                        }
                        if (c12328e2.vip == 0) {
                            c0583e.amazon(null, c12328e2.billing());
                        }
                    } else if (((Boolean) c3685e.invoke(billing2)).booleanValue()) {
                        c0583e.advert(null);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7429e
    public int isPro(int i) {
        return i;
    }

    public boolean isVip() {
        return !(((Number) ((C16747e) this.f20360e).f32835e.getValue()).floatValue() == 0.0f);
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        C13705e c13705e = (C13705e) obj;
        c13705e.getClass();
        ((InterfaceC13297e) ((C11980e) this.f20360e).f23950e).vip(c13705e);
    }

    public void loadAd(C11387e c11387e) {
        synchronized (c11387e) {
        }
        Handler handler = (Handler) this.f20361e;
        if (handler != null) {
            handler.post(new RunnableC14733e(this, c11387e, 1));
        }
    }

    @Override // defpackage.InterfaceC15989e
    public List metrica(Integer num) {
        List metrica = ((InterfaceC15989e) this.f20361e).metrica(null);
        C14479e c14479e = (C14479e) this.f20360e;
        int i = c14479e.tapsense;
        return i < 0 ? metrica : AbstractC13480e.m3584final(AbstractC4107e.vip(c14479e, num, i, Integer.valueOf(c14479e.firebase(c14479e.vip, i))), metrica);
    }

    @Override // defpackage.InterfaceC12006e
    public void mopub(C2573e c2573e) {
        if (((C12431e) c2573e.ad().f33137e).f24868e == 1) {
            C4085e c4085e = (C4085e) ((C12431e) c2573e.ad().f33137e).f24870e[0];
            if (C12347e.appmetrica(AbstractC9262e.metrica(c4085e.ad, c4085e.vip)) == 1 && C12347e.license(c2573e.f6428e)) {
                C4085e c4085e2 = (C4085e) ((C12431e) c2573e.ad().f33137e).f24870e[0];
                int billing = C12347e.billing(AbstractC9262e.metrica(c4085e2.ad, c4085e2.vip));
                if (((C16330e) this.f20360e).purchase() != billing) {
                    ((C7755e) this.f20361e).invoke();
                    crashlytics(billing);
                    return;
                }
                return;
            }
        }
        crashlytics(-1);
    }

    public Long pro(String str) {
        AbstractC3594e abstractC3594e = (AbstractC3594e) this.f20361e;
        C6096e purchase = C6096e.purchase(1, "SELECT long_value FROM Preference where `key`=?");
        purchase.Signature(1, str);
        abstractC3594e.vip();
        Cursor billing = abstractC3594e.billing(purchase);
        try {
            Long l = null;
            if (billing.moveToFirst() && !billing.isNull(0)) {
                l = Long.valueOf(billing.getLong(0));
            }
            return l;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        return new C14480e(((InterfaceC15169e) this.f20361e).remoteconfig(), (InterfaceC6269e) this.f20360e);
    }

    public void signatures(byte[] bArr) {
        if (((long[][]) this.f20360e) == null) {
            this.f20360e = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else {
            byte[] bArr2 = (byte[]) this.f20361e;
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                i |= bArr2[i2] ^ bArr[i2];
            }
            if (((byte) ((((i >>> 1) | (i & 1)) - 1) >> 31)) != 0) {
                return;
            }
        }
        byte[] bArr3 = new byte[16];
        this.f20361e = bArr3;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = bArr[i3];
        }
        byte[] bArr4 = (byte[]) this.f20361e;
        long[] jArr = ((long[][]) this.f20360e)[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            jArr[i5] = AbstractC3628e.license(i4, bArr4);
            i4 += 8;
        }
        long[] jArr2 = ((long[][]) this.f20360e)[1];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
        for (int i6 = 2; i6 < 256; i6 += 2) {
            long[][] jArr3 = (long[][]) this.f20360e;
            long[] jArr4 = jArr3[i6 >> 1];
            long[] jArr5 = jArr3[i6];
            long j4 = jArr4[0];
            long j5 = jArr4[1];
            long j6 = j4 >> 63;
            long j7 = ((j4 ^ ((-2233785415175766016L) & j6)) << 1) | (j5 >>> 63);
            jArr5[0] = j7;
            long j8 = (j5 << 1) | (-j6);
            jArr5[1] = j8;
            long[] jArr6 = jArr3[1];
            long[] jArr7 = jArr3[i6 + 1];
            jArr7[0] = j7 ^ jArr6[0];
            jArr7[1] = jArr6[1] ^ j8;
        }
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture smaato(byte[] bArr) {
        return AbstractC2017e.purchase(((InterfaceC14343e) this.f20361e).smaato(bArr), new C11399e(2, this), EnumC3320e.f7489e);
    }

    public boolean startapp() {
        String str;
        Signature signature;
        PackageManager packageManager = (PackageManager) this.f20360e;
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && (str = packagesForUid[0]) != null) {
            for (C6571e c6571e : ((C17221e) this.f20361e).ad) {
                if (AbstractC7890e.billing(c6571e.f13544e, str)) {
                    String str2 = BuildConfig.FLAVOR;
                    try {
                        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                        if (signatureArr != null && (signature = signatureArr[0]) != null) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                            messageDigest.update(signature.toByteArray());
                            byte[] digest = messageDigest.digest();
                            str2 = String.format("%0" + (digest.length << 1) + 'X', Arrays.copyOf(new Object[]{new BigInteger(1, digest)}, 1));
                        }
                    } catch (Exception unused) {
                    }
                    if (str2.equalsIgnoreCase((String) c6571e.f13543e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void subs(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((Messenger) this.f20361e).send(obtain);
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        if (c4602e.f9921e) {
            return;
        }
        ((C13578e) this.f20360e).billing(c11058e);
    }

    public void tapsense(C12377e c12377e) {
        AbstractC3594e abstractC3594e = (AbstractC3594e) this.f20361e;
        abstractC3594e.vip();
        abstractC3594e.metrica();
        try {
            ((C3606e) this.f20360e).appmetrica(c12377e);
            abstractC3594e.yandex();
        } finally {
            abstractC3594e.purchase();
        }
    }

    public String toString() {
        switch (this.f20362e) {
            case 0:
                return (String) this.f20361e;
            case 12:
                String str = "[ ";
                if (((C0511e) this.f20361e) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder inmobi = AbstractC8703e.inmobi(str);
                        inmobi.append(((C0511e) this.f20361e).f2617e[i]);
                        inmobi.append(" ");
                        str = inmobi.toString();
                    }
                }
                StringBuilder isPro = AbstractC8703e.isPro(str, "] ");
                isPro.append((C0511e) this.f20361e);
                return isPro.toString();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "var " + ((String) this.f20361e) + " = " + ((InterfaceC7004e) this.f20360e) + ";";
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((InterfaceC17556e) this.f20361e) + " + " + ((InterfaceC7004e) this.f20360e);
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return AbstractC17540e.license("\nwhile (" + ((C3168e) this.f20361e) + ") {\n    " + AbstractC13480e.m3608try((List) this.f20360e, "\n", null, null, null, 62) + "\n};\n            ");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9250e
    public void vip(C16756e c16756e, int i) {
        int[] iArr = (int[]) this.f20360e;
        try {
            c16756e.read((byte[]) this.f20361e, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c16756e.close();
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        int i = ((C4753e) this.f20361e).purchase;
        if (i == 2 && (th instanceof CancellationException)) {
            AbstractC9464e.yandex("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            return;
        }
        AbstractC9464e.pro("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC16982e.metrica(i), th);
    }
}
