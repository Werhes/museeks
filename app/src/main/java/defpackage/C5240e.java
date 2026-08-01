package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5240e extends AbstractC7884e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final String[] f11149e = {"firebase_", "google_", "ga_"};

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final String[] f11150e = {"_err"};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AtomicLong f11151e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Boolean f11152e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public SecureRandom f11153e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Integer f11154e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C16066e f11155e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11156e;

    public C5240e(C6936e c6936e) {
        super(c6936e);
        this.f11154e = null;
        this.f11151e = new AtomicLong(0L);
    }

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public static byte[] m1776e(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    public static boolean m1777e(Context context) {
        ActivityInfo receiverInfo;
        AbstractC9528e.startapp(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: eؓؕۙ, reason: contains not printable characters */
    public static boolean m1778e(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public static int m1779e() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* renamed from: eؕۚٙ, reason: contains not printable characters */
    public static boolean m1780e(String str) {
        AbstractC9528e.purchase(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public static final boolean m1781e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public static boolean m1782e(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    public static ArrayList m1783e(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15148e c15148e = (C15148e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c15148e.f29987e);
            bundle.putString("origin", c15148e.f29982e);
            bundle.putLong("creation_timestamp", c15148e.f29985e);
            bundle.putString("name", c15148e.f29980e.f18221e);
            Object billing = c15148e.f29980e.billing();
            AbstractC9528e.startapp(billing);
            AbstractC6190e.advert(bundle, billing);
            bundle.putBoolean("active", c15148e.f29979e);
            String str = c15148e.f29989e;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C15541e c15541e = c15148e.f29988e;
            if (c15541e != null) {
                bundle.putString("timed_out_event_name", c15541e.f30689e);
                C3276e c3276e = c15541e.f30687e;
                if (c3276e != null) {
                    bundle.putBundle("timed_out_event_params", c3276e.adcel());
                }
            }
            bundle.putLong("trigger_timeout", c15148e.f29983e);
            C15541e c15541e2 = c15148e.f29986e;
            if (c15541e2 != null) {
                bundle.putString("triggered_event_name", c15541e2.f30689e);
                C3276e c3276e2 = c15541e2.f30687e;
                if (c3276e2 != null) {
                    bundle.putBundle("triggered_event_params", c3276e2.adcel());
                }
            }
            bundle.putLong("triggered_timestamp", c15148e.f29980e.f18220e);
            bundle.putLong("time_to_live", c15148e.f29981e);
            C15541e c15541e3 = c15148e.f29984e;
            if (c15541e3 != null) {
                bundle.putString("expired_event_name", c15541e3.f30689e);
                C3276e c3276e3 = c15541e3.f30687e;
                if (c3276e3 != null) {
                    bundle.putBundle("expired_event_params", c3276e3.adcel());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public static String m1784e(String str, boolean z, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public static boolean m1785e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public static boolean m1786e(Context context) {
        AbstractC9528e.startapp(context);
        return Build.VERSION.SDK_INT >= 24 ? m1782e(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m1782e(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: eِۜۙ, reason: contains not printable characters */
    public static void m1787e(C13288e c13288e, Bundle bundle, boolean z) {
        if (bundle != null && c13288e != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c13288e.ad;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c13288e.vip;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c13288e.metrica);
                return;
            }
            z = false;
        }
        if (bundle != null && c13288e == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public static long m1788e(byte[] bArr) {
        AbstractC9528e.startapp(bArr);
        int length = bArr.length;
        int i = 0;
        AbstractC9528e.advert(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public static MessageDigest m1789e() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public static final boolean m1790e(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* renamed from: eٓۦْ, reason: contains not printable characters */
    public static boolean m1791e(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                String host = new URL(stringExtra).getHost();
                if (!TextUtils.isEmpty(host)) {
                    return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
                }
            } catch (MalformedURLException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public static void m1792e(InterfaceC8444e interfaceC8444e, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m1790e(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC8444e.yandex(str, "_err", bundle);
    }

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public static boolean m1793e(String str, String[] strArr) {
        AbstractC9528e.startapp(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public final void m1794e(InterfaceC9026e interfaceC9026e, Bundle bundle) {
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning bundle value to wrapper");
        }
    }

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public final int m1795e() {
        if (this.f11154e == null) {
            C6936e c6936e = (C6936e) this.f36443e;
            C17991e c17991e = C17991e.vip;
            Context context = c6936e.f14225e;
            c17991e.getClass();
            this.f11154e = Integer.valueOf(C17991e.ad(context) / 1000);
        }
        return this.f11154e.intValue();
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m1796e(String str, String str2, Bundle bundle, List list, boolean z) {
        int m1829e;
        int m1810e;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C6936e c6936e = (C6936e) this.f36443e;
        C10476e c10476e = c6936e.f14221e;
        C13879e c13879e = c6936e.f14227e;
        C7269e c7269e = c6936e.f14202e;
        C5240e c5240e = ((C6936e) c10476e.f36443e).f14223e;
        C6936e.purchase(c5240e);
        int i = true != c5240e.m1797e(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                m1829e = !z ? m1829e(str3) : 0;
                if (m1829e == 0) {
                    m1829e = m1833e(str3);
                }
            } else {
                m1829e = 0;
            }
            if (m1829e != 0) {
                m1812e(bundle, m1829e, str3, m1829e == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m1778e(bundle.get(str3))) {
                    C6936e.yandex(c13879e);
                    c13879e.f27494e.license("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    m1810e = 22;
                } else {
                    m1810e = m1810e(str, str3, bundle.get(str3), bundle, list2, z, false);
                }
                if (m1810e != 0 && !"_ev".equals(str3)) {
                    m1812e(bundle, m1810e, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m1780e(str3) && !m1793e(str3, AbstractC1266e.appmetrica)) {
                    i2++;
                    if (!m1797e(231100000)) {
                        C6936e.yandex(c13879e);
                        c13879e.f27501e.metrica(c7269e.ad(str), c7269e.appmetrica(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        m1790e(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            C6936e.yandex(c13879e);
                            C14937e c14937e = c13879e.f27501e;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            c14937e.metrica(c7269e.ad(str), c7269e.appmetrica(bundle), sb.toString());
                        }
                        m1790e(28, bundle);
                        bundle.remove(str3);
                        list2 = list;
                        z2 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public final boolean m1797e(int i) {
        Boolean bool = ((C6936e) this.f36443e).mopub().f20968e;
        if (m1795e() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public final void m1798e(InterfaceC9026e interfaceC9026e, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning bundle list to wrapper");
        }
    }

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public final void m1799e(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public final boolean m1800e(String str) {
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        if (((Context) C5277e.ad(c6936e.f14225e).ad).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27496e.vip(str, "Permission not granted");
        return false;
    }

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public final C16066e m1801e() {
        C11057e c11057e;
        if (this.f11155e == null) {
            Context context = ((C6936e) this.f36443e).f14225e;
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            C0982e c0982e = C0982e.ad;
            sb.append(i >= 33 ? c0982e.ad() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? c0982e.ad() : 0) >= 5) {
                c11057e = new C11057e(context, 1);
            } else {
                C13519e c13519e = C13519e.ad;
                if (((i == 31 || i == 32) ? c13519e.ad() : 0) >= 9) {
                    try {
                        c11057e = new C11057e(context, 0);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? c13519e.ad() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                    }
                }
                c11057e = null;
            }
            this.f11155e = c11057e != null ? new C16066e(c11057e) : null;
        }
        return this.f11155e;
    }

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public final boolean m1802e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C6936e) this.f36443e).f14221e.m2826e("debug.firebase.analytics.app").equals(str);
    }

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public final C15541e m1803e(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m1814e(str) != 0) {
            C6936e c6936e = (C6936e) this.f36443e;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(c6936e.f14202e.metrica(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle m1824e = m1824e(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            m1824e = m1819e(m1824e);
        }
        AbstractC9528e.startapp(m1824e);
        return new C15541e(str, new C3276e(m1824e), str2, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[RETURN] */
    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1804e() {
        /*
            r12 = this;
            r12.mo2250e()
            java.lang.Object r0 = r12.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            eّۙۤ r1 = r0.smaato()
            eٍؙٓ r0 = r0.f14227e
            java.lang.String r1 = r1.m3391e()
            eَؙؚ r2 = defpackage.AbstractC17254e.f33821e
            r3 = 0
            java.lang.Object r2 = r2.ad(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = m1781e(r2, r1)
            r4 = 0
            if (r1 != 0) goto L23
            return r4
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L2c
            r1 = 4
            goto L4c
        L2c:
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r2)
            r2 = 4
            if (r1 >= r2) goto L36
            r1 = 8
            goto L4c
        L36:
            int r1 = m1779e()
            eَؙؚ r2 = defpackage.AbstractC17254e.f33798const
            java.lang.Object r2 = r2.ad(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L4b
            r1 = 16
            goto L4c
        L4b:
            r1 = r4
        L4c:
            java.lang.String r6 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r6 = r12.m1800e(r6)
            if (r6 != 0) goto L57
            r6 = 2
            long r1 = r1 | r6
        L57:
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Lbb
            java.lang.Boolean r6 = r12.f11152e
            if (r6 != 0) goto Lb1
            eؚٖۧ r6 = r12.m1801e()
            r7 = 0
            if (r6 != 0) goto L67
            goto Lb7
        L67:
            com.google.common.util.concurrent.ListenableFuture r6 = r6.vip()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = r6.get(r9, r8)     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            if (r6 == 0) goto L88
            int r3 = r6.intValue()     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r8 = 1
            if (r3 != r8) goto L88
            r7 = r8
            goto L88
        L80:
            r3 = move-exception
            goto L99
        L82:
            r3 = move-exception
            goto L99
        L84:
            r3 = move-exception
            goto L99
        L86:
            r3 = move-exception
            goto L99
        L88:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r12.f11152e = r3     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            goto La7
        L8f:
            r6 = move-exception
            goto L96
        L91:
            r6 = move-exception
            goto L96
        L93:
            r6 = move-exception
            goto L96
        L95:
            r6 = move-exception
        L96:
            r11 = r6
            r6 = r3
            r3 = r11
        L99:
            defpackage.C6936e.yandex(r0)
            eِٔۙ r7 = r0.f27495e
            java.lang.String r8 = "Measurement manager api exception"
            r7.vip(r3, r8)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r12.f11152e = r3
        La7:
            defpackage.C6936e.yandex(r0)
            eِٔۙ r0 = r0.f27497e
            java.lang.String r3 = "Measurement manager api status result"
            r0.vip(r6, r3)
        Lb1:
            java.lang.Boolean r0 = r12.f11152e
            boolean r7 = r0.booleanValue()
        Lb7:
            if (r7 != 0) goto Lbb
            r1 = 64
        Lbb:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc2
            r0 = 1
            return r0
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5240e.m1804e():long");
    }

    /* renamed from: eؚؗۛ, reason: contains not printable characters */
    public final int m1805e(String str) {
        if (!m1820e("user property", str)) {
            return 6;
        }
        if (!m1808e("user property", AbstractC9408e.advert, null, str)) {
            return 15;
        }
        ((C6936e) this.f36443e).getClass();
        return !m1816e("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: eؗۗؓ, reason: contains not printable characters */
    public final Bundle m1806e(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C6936e c6936e = (C6936e) this.f36443e;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("gbraid");
                    str6 = uri.getQueryParameter("utm_id");
                    str7 = uri.getQueryParameter("dclid");
                    str8 = uri.getQueryParameter("srsltid");
                    str9 = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("campaign", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("source", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("medium", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("gclid", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gbraid", str5);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("content", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("campaign_id", str6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("dclid", str7);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("srsltid", str8);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("sfmc_id", str9);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33842e)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        c6936e.f14221e.getClass();
                        int max = Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        if (uri2.length() > max) {
                            uri2 = m1784e(uri2, true, max - 3);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.vip(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final boolean m1807e(String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (TextUtils.isEmpty(str)) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27501e.ad("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC9528e.startapp(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.yandex(c13879e2);
        c13879e2.f27501e.vip(C13879e.m3689e(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* renamed from: eؗۢؗ, reason: contains not printable characters */
    public final boolean m1808e(String str, String[] strArr, String[] strArr2, String str2) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str2 == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27501e.vip(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f11149e[i])) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27501e.metrica(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m1793e(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m1793e(str2, strArr2)) {
            return true;
        }
        C13879e c13879e3 = c6936e.f14227e;
        C6936e.yandex(c13879e3);
        c13879e3.f27501e.metrica(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final int m1809e(Object obj, String str) {
        return "_ldl".equals(str) ? m1832e("user property referrer", str, m1822e(str), obj) : m1832e("user property", str, m1822e(str), obj) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1810e(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5240e.m1810e(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: eؚِۛ, reason: contains not printable characters */
    public final boolean m1811e(String str) {
        return ((C6936e) this.f36443e).f14221e.m2822e(null, AbstractC17254e.f33822e) ? m1793e(str, AbstractC12992e.billing) : m1793e(str, AbstractC12992e.purchase);
    }

    @Override // defpackage.AbstractC7884e
    /* renamed from: eؚۚۦ */
    public final boolean mo487e() {
        return true;
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final void m1812e(Bundle bundle, int i, String str, Object obj) {
        if (m1790e(i, bundle)) {
            ((C6936e) this.f36443e).getClass();
            bundle.putString("_ev", m1784e(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final Object m1813e(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m1784e(obj.toString(), z, i);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle m1819e = m1819e((Bundle) parcelable);
                if (!m1819e.isEmpty()) {
                    arrayList.add(m1819e);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: eًؙٞ, reason: contains not printable characters */
    public final int m1814e(String str) {
        if (!m1820e("event", str)) {
            return 2;
        }
        if (m1808e("event", AbstractC12992e.metrica, ((C6936e) this.f36443e).f14221e.m2822e(null, AbstractC17254e.f33822e) ? AbstractC12992e.appmetrica : AbstractC12992e.license, str)) {
            return !m1816e("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public final String m1815e() {
        byte[] bArr = new byte[16];
        m1834e().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: eٌۜۧ, reason: contains not printable characters */
    public final boolean m1816e(String str, int i, String str2) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str2 == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27501e.vip(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.yandex(c13879e2);
        c13879e2.f27501e.license("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public final void m1817e(InterfaceC9026e interfaceC9026e, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning int value to wrapper");
        }
    }

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public final void m1818e(InterfaceC9026e interfaceC9026e, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning byte array to wrapper");
        }
    }

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public final Bundle m1819e(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m1831e = m1831e(bundle.get(str), str);
                if (m1831e == null) {
                    C6936e c6936e = (C6936e) this.f36443e;
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27494e.vip(c6936e.f14202e.vip(str), "Param value can't be null");
                } else {
                    m1838e(bundle2, str, m1831e);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: eِؔۛ, reason: contains not printable characters */
    public final boolean m1820e(String str, String str2) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str2 == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27501e.vip(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27501e.vip(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                C13879e c13879e3 = c6936e.f14227e;
                C6936e.yandex(c13879e3);
                c13879e3.f27501e.metrica(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                C13879e c13879e4 = c6936e.f14227e;
                C6936e.yandex(c13879e4);
                c13879e4.f27501e.metrica(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public final void m1821e(String str, InterfaceC9026e interfaceC9026e) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning string value to wrapper");
        }
    }

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final int m1822e(String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        if ("_ldl".equals(str)) {
            c6936e.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c6936e.getClass();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ("_lgclid".equals(str)) {
            c6936e.getClass();
            return 100;
        }
        c6936e.getClass();
        return 36;
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m1823e(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                C5240e c5240e = ((C6936e) this.f36443e).f14223e;
                C6936e.purchase(c5240e);
                c5240e.m1838e(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final Bundle m1824e(String str, Bundle bundle, List list, boolean z) {
        int m1829e;
        List list2 = list;
        boolean m1793e = m1793e(str, AbstractC12992e.startapp);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C6936e c6936e = (C6936e) this.f36443e;
        C10476e c10476e = c6936e.f14221e;
        C7269e c7269e = c6936e.f14202e;
        C5240e c5240e = ((C6936e) c10476e.f36443e).f14223e;
        C6936e.purchase(c5240e);
        int i = c5240e.m1797e(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                m1829e = !z ? m1829e(str2) : 0;
                if (m1829e == 0) {
                    m1829e = m1833e(str2);
                }
            } else {
                m1829e = 0;
            }
            if (m1829e != 0) {
                m1812e(bundle2, m1829e, str2, m1829e == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int m1810e = m1810e(str, str2, bundle.get(str2), bundle2, list2, z, m1793e);
                if (m1810e == 17) {
                    m1812e(bundle2, 17, str2, Boolean.FALSE);
                } else if (m1810e != 0 && !"_ev".equals(str2)) {
                    m1812e(bundle2, m1810e, m1810e == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m1780e(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String sb2 = sb.toString();
                            C13879e c13879e = c6936e.f14227e;
                            C6936e.yandex(c13879e);
                            c13879e.f27501e.metrica(c7269e.ad(str), c7269e.appmetrica(bundle), sb2);
                        }
                        m1790e(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void m1825e(C7764e c7764e, int i) {
        Bundle bundle = c7764e.appmetrica;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m1780e(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    C6936e c6936e = (C6936e) this.f36443e;
                    C13879e c13879e = c6936e.f14227e;
                    C7269e c7269e = c6936e.f14202e;
                    C6936e.yandex(c13879e);
                    c13879e.f27501e.metrica(c7269e.ad(c7764e.ad), c7269e.appmetrica(bundle), sb2);
                    m1790e(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public final boolean m1826e(Context context, String str) {
        Signature[] signatureArr;
        C6936e c6936e = (C6936e) this.f36443e;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo metrica = C5277e.ad(context).metrica(64, str);
            if (metrica == null || (signatureArr = metrica.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* renamed from: eٓۗٞ, reason: contains not printable characters */
    public final long m1827e() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f11151e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f11151e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((C6936e) this.f36443e).f14215e.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f11156e + 1;
            this.f11156e = i;
            j = nextLong + i;
        }
        return j;
    }

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public final void m1828e(InterfaceC9026e interfaceC9026e, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning boolean value to wrapper");
        }
    }

    /* renamed from: eِۣٔ, reason: contains not printable characters */
    public final int m1829e(String str) {
        if (!m1837e("event param", str)) {
            return 3;
        }
        if (!m1808e("event param", null, null, str)) {
            return 14;
        }
        ((C6936e) this.f36443e).getClass();
        return !m1816e("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final Object m1830e(Object obj, String str) {
        return "_ldl".equals(str) ? m1813e(m1822e(str), obj, true, false) : m1813e(m1822e(str), obj, false, false);
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final Object m1831e(Object obj, String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        int i = 500;
        if ("_ev".equals(str)) {
            c6936e.f14221e.getClass();
            return m1813e(Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES), obj, true, true);
        }
        if (m1785e(str)) {
            c6936e.f14221e.getClass();
            i = Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } else {
            c6936e.f14221e.getClass();
        }
        return m1813e(i, obj, false, true);
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final boolean m1832e(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27494e.license("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    /* renamed from: eٖٜۡ, reason: contains not printable characters */
    public final int m1833e(String str) {
        if (!m1820e("event param", str)) {
            return 3;
        }
        if (!m1808e("event param", null, null, str)) {
            return 14;
        }
        ((C6936e) this.f36443e).getClass();
        return !m1816e("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: e٘ؔؖ, reason: contains not printable characters */
    public final SecureRandom m1834e() {
        mo2250e();
        if (this.f11153e == null) {
            this.f11153e = new SecureRandom();
        }
        return this.f11153e;
    }

    /* renamed from: eِ٘, reason: contains not printable characters */
    public final void m1835e(InterfaceC9026e interfaceC9026e, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC9026e.tapsense(bundle);
        } catch (RemoteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error returning long value to wrapper");
        }
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void m1836e(Parcelable[] parcelableArr, int i) {
        AbstractC9528e.startapp(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (m1780e(str) && !m1793e(str, AbstractC1266e.appmetrica) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        C6936e c6936e = (C6936e) this.f36443e;
                        C13879e c13879e = c6936e.f14227e;
                        C7269e c7269e = c6936e.f14202e;
                        C6936e.yandex(c13879e);
                        C14937e c14937e = c13879e.f27501e;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        c14937e.metrica(c7269e.vip(str), c7269e.appmetrica(bundle), sb.toString());
                    }
                    m1790e(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* renamed from: e۠ۢ, reason: contains not printable characters */
    public final boolean m1837e(String str, String str2) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str2 == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27501e.vip(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27501e.vip(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27501e.metrica(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                C13879e c13879e4 = c6936e.f14227e;
                C6936e.yandex(c13879e4);
                c13879e4.f27501e.metrica(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final void m1838e(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C6936e c6936e = (C6936e) this.f36443e;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27494e.metrica(c6936e.f14202e.vip(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }
}
