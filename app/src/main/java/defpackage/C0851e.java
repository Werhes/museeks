package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851e {
    public Uri Signature;
    public final crashlytics ad;
    public boolean admob;
    public boolean advert;
    public C3906e amazon;
    public final C15214e[] appmetrica;
    public final C8938e billing;
    public final C2691e license;
    public Uri loadAd;
    public final InterfaceC9660e metrica;
    public final C5350e mopub;
    public final C16975e[] purchase;
    public final List startapp;
    public InterfaceC17119e subscription;
    public final InterfaceC9660e vip;
    public final C16437e yandex;
    public final C15816e adcel = new C15816e(12);
    public byte[] smaato = AbstractC9413e.vip;
    public long remoteconfig = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [eؚٖؖ, eُٗٛ, eؓۤۚ] */
    public C0851e(crashlytics crashlyticsVar, C8938e c8938e, C15214e[] c15214eArr, C16975e[] c16975eArr, C5389e c5389e, InterfaceC4407e interfaceC4407e, C2691e c2691e, List list, C5350e c5350e) {
        this.ad = crashlyticsVar;
        this.billing = c8938e;
        this.appmetrica = c15214eArr;
        this.purchase = c16975eArr;
        this.license = c2691e;
        this.startapp = list;
        this.mopub = c5350e;
        InterfaceC9660e remoteconfig = ((InterfaceC15169e) c5389e.f11540e).remoteconfig();
        this.vip = remoteconfig;
        if (interfaceC4407e != null) {
            remoteconfig.license(interfaceC4407e);
        }
        this.metrica = ((InterfaceC15169e) c5389e.f11540e).remoteconfig();
        this.yandex = new C16437e(BuildConfig.FLAVOR, c16975eArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c15214eArr.length; i2++) {
            if ((c16975eArr[i2].purchase & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        C16437e c16437e = this.yandex;
        int[] Signature = AbstractC10509e.Signature(arrayList);
        ?? abstractC2207e = new AbstractC2207e(c16437e, Signature);
        C16975e c16975e = c16437e.license[Signature[0]];
        while (true) {
            if (i >= abstractC2207e.vip) {
                i = -1;
                break;
            } else if (abstractC2207e.license[i] == c16975e) {
                break;
            } else {
                i++;
            }
        }
        abstractC2207e.billing = i;
        this.subscription = abstractC2207e;
    }

    public static C12921e appmetrica(C9144e c9144e, long j, int i) {
        long j2 = c9144e.mopub;
        AbstractC17475e abstractC17475e = c9144e.remoteconfig;
        int i2 = (int) (j - j2);
        AbstractC17475e abstractC17475e2 = c9144e.subscription;
        if (i2 == abstractC17475e2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC17475e.size()) {
                return new C12921e((AbstractC18065e) abstractC17475e.get(i), j, i);
            }
            return null;
        }
        C2720e c2720e = (C2720e) abstractC17475e2.get(i2);
        if (i == -1) {
            return new C12921e(c2720e, j, -1);
        }
        if (i < c2720e.f6606e.size()) {
            return new C12921e((AbstractC18065e) c2720e.f6606e.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC17475e2.size()) {
            return new C12921e((AbstractC18065e) abstractC17475e2.get(i3), j + 1, -1);
        }
        if (abstractC17475e.isEmpty()) {
            return null;
        }
        return new C12921e((AbstractC18065e) abstractC17475e.get(0), j + 1, 0);
    }

    public final C6008e ad(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C8938e c8938e = this.billing;
        C4232e c4232e = (C4232e) c8938e.f17919e.get(uri);
        C15214e c15214e = c4232e != null ? c4232e.ad : null;
        c15214e.getClass();
        HashMap hashMap = c15214e.vip;
        int size = hashMap.size();
        AbstractC7014e it = AbstractC12614e.admob(hashMap.values()).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            C4232e c4232e2 = (C4232e) c8938e.f17919e.get(uri2);
            if (c4232e2 != null) {
                C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e2.vip, uri2, uri2);
                c15762e.getClass();
                if (elapsedRealtime <= c15762e.f31047e) {
                    i2++;
                }
            }
        }
        int length = this.subscription.length();
        InterfaceC17119e interfaceC17119e = this.subscription;
        int i3 = 0;
        while (true) {
            C15214e[] c15214eArr = this.appmetrica;
            if (i >= c15214eArr.length) {
                return new C6008e(size, i2, length, i3);
            }
            if (interfaceC17119e.yandex(i, elapsedRealtime) || c8938e.billing(c15214eArr[i], elapsedRealtime)) {
                i3++;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8 A[EDGE_INSN: B:61:0x00e8->B:63:0x00e8 BREAK  A[LOOP:0: B:47:0x00b9->B:51:0x00e5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair license(defpackage.C8170e r20, boolean r21, defpackage.C9144e r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0851e.license(eًۘٚ, boolean, eٌۨ, long, long):android.util.Pair");
    }

    public final int metrica(C8170e c8170e) {
        int i = c8170e.loadAd;
        if (i == -1) {
            return 1;
        }
        C9144e metrica = this.billing.metrica(false, c8170e.smaato);
        metrica.getClass();
        AbstractC17475e abstractC17475e = metrica.subscription;
        int i2 = (int) (c8170e.adcel - metrica.mopub);
        if (i2 < 0) {
            return 1;
        }
        AbstractC17475e abstractC17475e2 = i2 < abstractC17475e.size() ? ((C2720e) abstractC17475e.get(i2)).f6606e : metrica.remoteconfig;
        if (i >= abstractC17475e2.size()) {
            return 2;
        }
        C12966e c12966e = (C12966e) abstractC17475e2.get(i);
        if (c12966e.f25832e) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC17352e.yandex(metrica.ad, c12966e.f35435e)), c8170e.vip.ad) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [eٖٜۧ, eٖؓٚ] */
    public final C16361e purchase(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C15816e c15816e = this.adcel;
        byte[] bArr = (byte[]) ((C12041e) c15816e.f31190e).remove(uri);
        if (bArr != null) {
            return null;
        }
        C2435e c2435e = new C2435e(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1, null);
        C16975e c16975e = this.purchase[i];
        int pro = this.subscription.pro();
        Object isVip = this.subscription.isVip();
        byte[] bArr2 = this.smaato;
        ?? abstractC15951e = new AbstractC15951e(this.metrica, c2435e, 3, c16975e, pro, isVip, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC9413e.vip;
        }
        abstractC15951e.adcel = bArr2;
        return abstractC15951e;
    }

    public final InterfaceC14651e[] vip(C8170e c8170e, long j) {
        List list;
        C0851e c0851e = this;
        C8170e c8170e2 = c8170e;
        int vip = c8170e2 == null ? -1 : c0851e.yandex.vip(c8170e2.license);
        int length = c0851e.subscription.length();
        InterfaceC14651e[] interfaceC14651eArr = new InterfaceC14651e[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int Signature = c0851e.subscription.Signature(i);
            Uri metrica = c0851e.appmetrica[Signature].metrica();
            C8938e c8938e = c0851e.billing;
            if (c8938e.yandex(metrica)) {
                C9144e metrica2 = c8938e.metrica(z, metrica);
                metrica2.getClass();
                long j2 = metrica2.yandex - c8938e.f17918e;
                Pair license = c0851e.license(c8170e2, Signature != vip ? true : z, metrica2, j2, j);
                long longValue = ((Long) license.first).longValue();
                int intValue = ((Integer) license.second).intValue();
                long j3 = metrica2.mopub;
                AbstractC17475e abstractC17475e = metrica2.remoteconfig;
                AbstractC17475e abstractC17475e2 = metrica2.subscription;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || abstractC17475e2.size() < i2) {
                    C2171e c2171e = AbstractC17475e.f34223e;
                    list = C1410e.f4222e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC17475e2.size()) {
                        if (intValue != -1) {
                            C2720e c2720e = (C2720e) abstractC17475e2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(c2720e);
                            } else if (intValue < c2720e.f6606e.size()) {
                                AbstractC17475e abstractC17475e3 = c2720e.f6606e;
                                arrayList.addAll(abstractC17475e3.subList(intValue, abstractC17475e3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC17475e2.subList(i2, abstractC17475e2.size()));
                        intValue = 0;
                    }
                    if (metrica2.amazon != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < abstractC17475e.size()) {
                            arrayList.addAll(abstractC17475e.subList(intValue, abstractC17475e.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                interfaceC14651eArr[i] = new C10112e(j2, list);
            } else {
                interfaceC14651eArr[i] = InterfaceC14651e.f28890while;
            }
            i++;
            c0851e = this;
            c8170e2 = c8170e;
            z = false;
        }
        return interfaceC14651eArr;
    }
}
