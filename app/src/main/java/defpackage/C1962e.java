package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962e {
    public static final String adcel;
    public static final String advert;
    public static final C1962e billing;
    public static final String mopub;
    public static final String smaato;
    public static final String startapp;
    public static final String yandex;
    public final String ad;
    public final C8437e appmetrica;
    public final C12053e license;
    public final C15197e metrica;
    public final C13325e purchase;
    public final C16914e vip;

    /* JADX WARN: Type inference failed for: r4v0, types: [eٌّؒ, eٔؐۜ] */
    static {
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        billing = new C1962e(BuildConfig.FLAVOR, new C14435e(c9466e), null, new C15197e(c9457e), C12053e.f24142throw, C13325e.license);
        yandex = Integer.toString(0, 36);
        startapp = Integer.toString(1, 36);
        adcel = Integer.toString(2, 36);
        mopub = Integer.toString(3, 36);
        advert = Integer.toString(4, 36);
        smaato = Integer.toString(5, 36);
    }

    public C1962e(String str, C8437e c8437e, C16914e c16914e, C15197e c15197e, C12053e c12053e, C13325e c13325e) {
        this.ad = str;
        this.vip = c16914e;
        this.metrica = c15197e;
        this.license = c12053e;
        this.appmetrica = c8437e;
        this.purchase = c13325e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1962e ad(int i, Bundle bundle) {
        C14435e c14435e;
        C13325e c13325e;
        Map vip;
        C8369e c8369e;
        C10384e c10384e;
        C1410e billing2;
        C1410e metrica;
        C16914e c16914e;
        String string = bundle.getString(yandex, BuildConfig.FLAVOR);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(startapp);
        C15197e vip2 = bundle2 == null ? C15197e.purchase : C15197e.vip(bundle2);
        Bundle bundle3 = bundle.getBundle(adcel);
        C12053e vip3 = bundle3 == null ? C12053e.f24142throw : C12053e.vip(i, bundle3);
        Bundle bundle4 = bundle.getBundle(mopub);
        boolean z = false;
        if (bundle4 == null) {
            c14435e = C8437e.subscription;
        } else {
            C9466e c9466e = new C9466e();
            String str = C14435e.adcel;
            C14435e c14435e2 = C14435e.startapp;
            long j = c14435e2.ad;
            long j2 = c14435e2.license;
            long j3 = c14435e2.vip;
            long m2546case = AbstractC9413e.m2546case(bundle4.getLong(str, j));
            boolean z2 = true;
            AbstractC2301e.billing(m2546case >= 0);
            c9466e.ad = m2546case;
            long m2546case2 = AbstractC9413e.m2546case(bundle4.getLong(C14435e.mopub, c14435e2.metrica));
            AbstractC2301e.billing(m2546case2 == Long.MIN_VALUE || m2546case2 >= 0);
            c9466e.vip = m2546case2;
            c9466e.metrica = bundle4.getBoolean(C14435e.advert, c14435e2.appmetrica);
            c9466e.license = bundle4.getBoolean(C14435e.smaato, c14435e2.purchase);
            c9466e.appmetrica = bundle4.getBoolean(C14435e.amazon, c14435e2.billing);
            c9466e.purchase = bundle4.getBoolean(C14435e.admob, c14435e2.yandex);
            long j4 = bundle4.getLong(C14435e.loadAd, j3);
            if (j4 != j3) {
                AbstractC2301e.billing(j4 >= 0);
                c9466e.ad = j4;
            }
            long j5 = bundle4.getLong(C14435e.Signature, j2);
            if (j5 != j2) {
                if (j5 != Long.MIN_VALUE && j5 < 0) {
                    z2 = false;
                }
                AbstractC2301e.billing(z2);
                c9466e.vip = j5;
            }
            c14435e = new C14435e(c9466e);
        }
        C8437e c8437e = c14435e;
        Bundle bundle5 = bundle.getBundle(advert);
        if (bundle5 == null) {
            c13325e = C13325e.license;
        } else {
            C18478e c18478e = new C18478e(23, z);
            c18478e.f36228e = (Uri) bundle5.getParcelable(C13325e.appmetrica);
            c18478e.f36227e = bundle5.getString(C13325e.purchase);
            c18478e.f36229e = AbstractC9413e.Signature(bundle5.getBundle(C13325e.billing));
            c13325e = new C13325e(c18478e);
        }
        C13325e c13325e2 = c13325e;
        Bundle bundle6 = bundle.getBundle(smaato);
        if (bundle6 == null) {
            c16914e = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(C16914e.advert);
            if (bundle7 == null) {
                c8369e = null;
            } else {
                String string2 = bundle7.getString(C8369e.startapp);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(C8369e.adcel);
                String str2 = C8369e.mopub;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    vip = C0409e.f2448e;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                hashMap.put(str3, string3);
                            }
                        }
                    }
                    vip = AbstractC8507e.vip(hashMap);
                }
                boolean z3 = bundle7.getBoolean(C8369e.advert, false);
                boolean z4 = bundle7.getBoolean(C8369e.smaato, false);
                boolean z5 = bundle7.getBoolean(C8369e.amazon, false);
                String str4 = C8369e.loadAd;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(arrayList);
                byte[] byteArray = bundle7.getByteArray(C8369e.Signature);
                C3560e c3560e = new C3560e();
                c3560e.license = fromString;
                c3560e.appmetrica = uri;
                c3560e.purchase = AbstractC8507e.vip(vip);
                c3560e.ad = z3;
                c3560e.metrica = z5;
                c3560e.vip = z4;
                c3560e.billing = AbstractC17475e.remoteconfig(remoteconfig);
                c3560e.yandex = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                c8369e = new C8369e(c3560e);
            }
            Bundle bundle10 = bundle6.getBundle(C16914e.smaato);
            if (bundle10 == null) {
                c10384e = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(C10384e.vip);
                uri2.getClass();
                C7850e c7850e = new C7850e(17, z);
                c7850e.f15896e = uri2;
                c10384e = new C10384e(c7850e);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(C16914e.amazon);
            if (parcelableArrayList == null) {
                C2171e c2171e = AbstractC17475e.f34223e;
                billing2 = C1410e.f4222e;
            } else {
                C13304e Signature = AbstractC17475e.Signature();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    Signature.metrica(new C8319e(bundle11.getInt(C8319e.f16994e, 0), bundle11.getInt(C8319e.f16993e, 0), bundle11.getInt(C8319e.f16995e, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                billing2 = Signature.billing();
            }
            C1410e c1410e = billing2;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(C16914e.Signature);
            if (parcelableArrayList2 == null) {
                C2171e c2171e2 = AbstractC17475e.f34223e;
                metrica = C1410e.f4222e;
            } else {
                metrica = AbstractC5092e.metrica(new C10612e(9), parcelableArrayList2);
            }
            C1410e c1410e2 = metrica;
            long j6 = bundle6.getLong(C16914e.admob, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(C16914e.adcel);
            uri3.getClass();
            c16914e = new C16914e(uri3, bundle6.getString(C16914e.mopub), c8369e, c10384e, c1410e, bundle6.getString(C16914e.loadAd), c1410e2, null, j6);
        }
        return new C1962e(string, c8437e, c16914e, vip2, vip3, c13325e2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٌّؒ, eٔؐۜ] */
    public static C1962e vip(Uri uri) {
        C16914e c16914e;
        C9466e c9466e = new C9466e();
        C3560e c3560e = new C3560e();
        List list = Collections.EMPTY_LIST;
        C1410e c1410e = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        AbstractC2301e.subscription(((Uri) c3560e.appmetrica) == null || ((UUID) c3560e.license) != null);
        C8369e c8369e = null;
        if (uri != null) {
            if (((UUID) c3560e.license) != null) {
                c8369e = new C8369e(c3560e);
            }
            c16914e = new C16914e(uri, null, c8369e, null, list, null, c1410e, null, -9223372036854775807L);
        } else {
            c16914e = null;
        }
        return new C1962e(BuildConfig.FLAVOR, new C14435e(c9466e), c16914e, new C15197e(c9457e), C12053e.f24142throw, c13325e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1962e)) {
            return false;
        }
        C1962e c1962e = (C1962e) obj;
        return Objects.equals(this.ad, c1962e.ad) && this.appmetrica.equals(c1962e.appmetrica) && Objects.equals(this.vip, c1962e.vip) && Objects.equals(this.metrica, c1962e.metrica) && Objects.equals(this.license, c1962e.license) && Objects.equals(this.purchase, c1962e.purchase);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C16914e c16914e = this.vip;
        return this.purchase.hashCode() + ((this.license.hashCode() + ((this.appmetrica.hashCode() + ((this.metrica.hashCode() + ((hashCode + (c16914e != null ? c16914e.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final Bundle metrica(int i, boolean z) {
        C16914e c16914e;
        Bundle bundle = new Bundle();
        String str = this.ad;
        if (!str.equals(BuildConfig.FLAVOR)) {
            bundle.putString(yandex, str);
        }
        C15197e c15197e = C15197e.purchase;
        C15197e c15197e2 = this.metrica;
        if (!c15197e2.equals(c15197e)) {
            bundle.putBundle(startapp, c15197e2.metrica());
        }
        C12053e c12053e = C12053e.f24142throw;
        C12053e c12053e2 = this.license;
        if (!c12053e2.equals(c12053e)) {
            bundle.putBundle(adcel, c12053e2.metrica(i));
        }
        C14435e c14435e = C14435e.startapp;
        C8437e c8437e = this.appmetrica;
        if (!c8437e.equals(c14435e)) {
            Bundle bundle2 = new Bundle();
            long j = c8437e.ad;
            if (j != c14435e.ad) {
                bundle2.putLong(C14435e.adcel, j);
            }
            long j2 = c8437e.metrica;
            if (j2 != c14435e.metrica) {
                bundle2.putLong(C14435e.mopub, j2);
            }
            long j3 = c8437e.vip;
            if (j3 != c14435e.vip) {
                bundle2.putLong(C14435e.loadAd, j3);
            }
            long j4 = c8437e.license;
            if (j4 != c14435e.license) {
                bundle2.putLong(C14435e.Signature, j4);
            }
            boolean z2 = c8437e.appmetrica;
            if (z2 != c14435e.appmetrica) {
                bundle2.putBoolean(C14435e.advert, z2);
            }
            boolean z3 = c8437e.purchase;
            if (z3 != c14435e.purchase) {
                bundle2.putBoolean(C14435e.smaato, z3);
            }
            boolean z4 = c8437e.billing;
            if (z4 != c14435e.billing) {
                bundle2.putBoolean(C14435e.amazon, z4);
            }
            boolean z5 = c8437e.yandex;
            if (z5 != c14435e.yandex) {
                bundle2.putBoolean(C14435e.admob, z5);
            }
            bundle.putBundle(mopub, bundle2);
        }
        C13325e c13325e = C13325e.license;
        C13325e c13325e2 = this.purchase;
        if (!c13325e2.equals(c13325e)) {
            Bundle bundle3 = new Bundle();
            Uri uri = c13325e2.ad;
            if (uri != null) {
                bundle3.putParcelable(C13325e.appmetrica, uri);
            }
            String str2 = c13325e2.vip;
            if (str2 != null) {
                bundle3.putString(C13325e.purchase, str2);
            }
            Bundle bundle4 = c13325e2.metrica;
            if (bundle4 != null) {
                bundle3.putBundle(C13325e.billing, bundle4);
            }
            bundle.putBundle(advert, bundle3);
        }
        if (z && (c16914e = this.vip) != null) {
            AbstractC17475e abstractC17475e = c16914e.billing;
            List list = c16914e.appmetrica;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(C16914e.adcel, c16914e.ad);
            String str3 = c16914e.vip;
            if (str3 != null) {
                bundle5.putString(C16914e.mopub, str3);
            }
            C8369e c8369e = c16914e.metrica;
            if (c8369e != null) {
                String str4 = C16914e.advert;
                AbstractC17475e abstractC17475e2 = c8369e.billing;
                AbstractC8507e abstractC8507e = c8369e.metrica;
                Bundle bundle6 = new Bundle();
                bundle6.putString(C8369e.startapp, c8369e.ad.toString());
                Uri uri2 = c8369e.vip;
                if (uri2 != null) {
                    bundle6.putParcelable(C8369e.adcel, uri2);
                }
                if (!abstractC8507e.isEmpty()) {
                    String str5 = C8369e.mopub;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : abstractC8507e.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = c8369e.license;
                if (z6) {
                    bundle6.putBoolean(C8369e.advert, z6);
                }
                boolean z7 = c8369e.appmetrica;
                if (z7) {
                    bundle6.putBoolean(C8369e.smaato, z7);
                }
                boolean z8 = c8369e.purchase;
                if (z8) {
                    bundle6.putBoolean(C8369e.amazon, z8);
                }
                if (!abstractC17475e2.isEmpty()) {
                    bundle6.putIntegerArrayList(C8369e.loadAd, new ArrayList<>(abstractC17475e2));
                }
                byte[] bArr = c8369e.yandex;
                if (bArr != null) {
                    bundle6.putByteArray(C8369e.Signature, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            C10384e c10384e = c16914e.license;
            if (c10384e != null) {
                String str6 = C16914e.smaato;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(C10384e.vip, c10384e.ad);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(C16914e.amazon, AbstractC5092e.billing(list, new C10612e(7)));
            }
            String str7 = c16914e.purchase;
            if (str7 != null) {
                bundle5.putString(C16914e.loadAd, str7);
            }
            if (!abstractC17475e.isEmpty()) {
                bundle5.putParcelableArrayList(C16914e.Signature, AbstractC5092e.billing(abstractC17475e, new C10612e(8)));
            }
            long j5 = c16914e.startapp;
            if (j5 != -9223372036854775807L) {
                bundle5.putLong(C16914e.admob, j5);
            }
            bundle.putBundle(smaato, bundle5);
        }
        return bundle;
    }
}
