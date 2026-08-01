package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0111e {
    public static final C2892e ad;
    public static volatile Handler license;
    public static Thread metrica;
    public static final Object vip;

    static {
        new C2892e(54774238, false, new C2916e(24));
        ad = new C2892e(-1041474540, false, new C2916e(25));
        new C2892e(-1602908606, false, new C2916e(26));
        new C2892e(-1855897012, false, new C2916e(27));
        vip = new Object();
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [subs, catch, eًٌَ] */
    public static C3780e ad(AbstractC9027e abstractC9027e) {
        if (abstractC9027e instanceof C7319e) {
            C7319e c7319e = (C7319e) abstractC9027e;
            return new C3780e(new C16527e(InterfaceC3408e.ad, new C11717e(AbstractC12348e.license(c7319e.f29816e))), AbstractC12442e.license(c7319e.f14990e));
        }
        if (abstractC9027e instanceof C12034e) {
            return new C3780e(new C16527e(InterfaceC3408e.vip), AbstractC12442e.license(((C12034e) abstractC9027e).f24060e));
        }
        if (abstractC9027e instanceof C8459e) {
            C8459e c8459e = (C8459e) abstractC9027e;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 1);
            try {
                byteArrayOutputStream.write(c8459e.vip());
                return new C3780e(new C16527e(InterfaceC5051e.f10810e), byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        if (abstractC9027e instanceof C3100e) {
            C3100e c3100e = (C3100e) abstractC9027e;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i = c3100e.f7181e;
            byteArrayOutputStream2.write((byte) (i >>> 24));
            byteArrayOutputStream2.write((byte) (i >>> 16));
            byteArrayOutputStream2.write((byte) (i >>> 8));
            byteArrayOutputStream2.write((byte) i);
            try {
                byteArrayOutputStream2.write(c3100e.f7180e.vip());
                return new C3780e(new C16527e(InterfaceC5051e.f10810e), byteArrayOutputStream2.toByteArray());
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        }
        if (abstractC9027e instanceof C1061e) {
            C1061e c1061e = (C1061e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.f24765extends.get((C4577e) c1061e.f3209e)), c1061e.getEncoded());
        }
        if (abstractC9027e instanceof C3960e) {
            C3960e c3960e = (C3960e) abstractC9027e;
            C7358e c7358e = c3960e.f8842e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.loadAd.get((C7942e) c3960e.f3209e)), AbstractC12442e.adcel(c7358e.ad, c7358e.vip));
        }
        if (abstractC9027e instanceof C18542e) {
            C18542e c18542e = (C18542e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.smaato.get((C16331e) c18542e.f3209e)), AbstractC12442e.license(c18542e.f36385e));
        }
        if (abstractC9027e instanceof C17464e) {
            C17464e c17464e = (C17464e) abstractC9027e;
            byte[] license2 = AbstractC16947e.license(c17464e.f34206e);
            byte[] license3 = AbstractC16947e.license(c17464e.f34203e);
            byte[] encoded = c17464e.getEncoded();
            return encoded.length > license2.length + license3.length ? new C3780e(new C16527e(InterfaceC15572e.ad), new Cprotected(encoded)) : new C3780e(new C16527e(InterfaceC3408e.metrica, new C10285e(c17464e.f34204e.vip, AbstractC12348e.purchase(c17464e.f29816e))), new C16474e(license2, license3));
        }
        if (abstractC9027e instanceof C5529e) {
            C5529e c5529e = (C5529e) abstractC9027e;
            byte[] bArr = c5529e.f11819e;
            byte[] bArr2 = c5529e.f11822e;
            byte[] license4 = AbstractC16947e.license(bArr2);
            byte[] license5 = AbstractC16947e.license(bArr);
            byte[] ad2 = c5529e.ad();
            if (ad2.length > license4.length + license5.length) {
                return new C3780e(new C16527e(InterfaceC15572e.vip), new Cprotected(ad2));
            }
            Ctry ctry = InterfaceC3408e.license;
            C13719e c13719e = c5529e.f11820e;
            return new C3780e(new C16527e(ctry, new C17299e(c13719e.metrica, c13719e.license, AbstractC12348e.purchase(c5529e.f29816e))), new C15184e(AbstractC16947e.license(bArr2), AbstractC16947e.license(bArr)));
        }
        if (abstractC9027e instanceof C16656e) {
            C16656e c16656e = (C16656e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.startapp.get((C6438e) c16656e.f3209e)), new Cprotected(AbstractC12442e.license(c16656e.f32677e)));
        }
        if (abstractC9027e instanceof C8225e) {
            C8225e c8225e = (C8225e) abstractC9027e;
            byte[] license6 = AbstractC12442e.license(c8225e.f16709e);
            C16527e c16527e = new C16527e((Ctry) AbstractC12348e.mopub.get((C18281e) c8225e.f3209e));
            ?? ccatch = new Ccatch(new Cprotected(license6));
            ccatch.f20096e = -1;
            return new C3780e(c16527e, (subs) ccatch);
        }
        if (abstractC9027e instanceof C6255e) {
            C6255e c6255e = (C6255e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.billing.get((C6000e) c6255e.f3209e)), new Cprotected(AbstractC12442e.license(c6255e.f13071e)));
        }
        if (abstractC9027e instanceof C10020e) {
            C10020e c10020e = (C10020e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.admob.get((C13948e) c10020e.f3209e)), AbstractC12442e.license(c10020e.f19794e));
        }
        if (abstractC9027e instanceof C9884e) {
            C9884e c9884e = (C9884e) abstractC9027e;
            C4113e c4113e = (C4113e) c9884e.f3209e;
            byte[] license7 = AbstractC12442e.license(c9884e.f19483e);
            C16527e c16527e2 = new C16527e((Ctry) AbstractC12348e.remoteconfig.get(c4113e));
            byte[] bArr3 = new byte[license7.length + 1];
            bArr3[0] = (byte) c4113e.f9072e;
            System.arraycopy(license7, 0, bArr3, 1, license7.length);
            return new C3780e(c16527e2, bArr3);
        }
        if (abstractC9027e instanceof C0957e) {
            C0957e c0957e = (C0957e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.f24767interface.get((C12532e) c0957e.f3209e)), AbstractC12442e.adcel(c0957e.f3395e, c0957e.f3396e));
        }
        if (abstractC9027e instanceof C1864e) {
            C1864e c1864e = (C1864e) abstractC9027e;
            C16449e c16449e = (C16449e) c1864e.f3209e;
            byte[] bArr4 = new byte[c16449e.f32284e];
            byte[] bArr5 = c1864e.f4955e;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            byte[] bArr6 = c1864e.f4956e;
            System.arraycopy(bArr6, 0, bArr4, bArr5.length, bArr6.length);
            return new C3780e(new C16527e((Ctry) AbstractC12348e.signatures.get(c16449e)), new Cprotected(bArr4));
        }
        if (abstractC9027e instanceof C7027e) {
            C7027e c7027e = (C7027e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.isVip.get((C11526e) c7027e.f3209e)), new Cprotected(AbstractC12442e.license(c7027e.f14387e)));
        }
        if (abstractC9027e instanceof C17060e) {
            C17060e c17060e = (C17060e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.isPro.get((C0838e) c17060e.f3209e)), AbstractC12442e.adcel(c17060e.f33398e, c17060e.f33399e));
        }
        if (abstractC9027e instanceof C15968e) {
            C15968e c15968e = (C15968e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.f24770this.get((C3456e) c15968e.f3209e)), c15968e.getEncoded());
        }
        if (abstractC9027e instanceof C14593e) {
            C14593e c14593e = (C14593e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.ads.get((C5539e) c14593e.f3209e)), AbstractC12442e.license(c14593e.f28796e));
        }
        if (abstractC9027e instanceof C18338e) {
            C18338e c18338e = (C18338e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.subs.get((C7795e) c18338e.f3209e)), AbstractC12442e.license(c18338e.f36010e));
        }
        if (abstractC9027e instanceof C2424e) {
            C2424e c2424e = (C2424e) abstractC9027e;
            C12048e c12048e = (C12048e) c2424e.f3209e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.firebase.get(c12048e)), new Cprotected(c12048e.f24096e != 1 ? AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(c2424e.f6228e, AbstractC1085e.adcel(c2424e.f6225e, false)), AbstractC1085e.adcel(c2424e.f6231e, true)), AbstractC1085e.adcel(c2424e.f6230e, false)), AbstractC1085e.adcel(c2424e.f6227e, true)), AbstractC1085e.adcel(c2424e.f6229e, true)) : AbstractC1085e.adcel(c2424e.f6226e, true)));
        }
        if (abstractC9027e instanceof C16204e) {
            C16204e c16204e = (C16204e) abstractC9027e;
            return new C3780e(new C16527e((Ctry) AbstractC12348e.f24773while.get((C10280e) c16204e.f3209e)), new Cprotected(AbstractC12442e.license(c16204e.f31825e)));
        }
        if (!(abstractC9027e instanceof C14077e)) {
            throw new IOException("key parameters not recognized");
        }
        C14077e c14077e = (C14077e) abstractC9027e;
        return new C3780e(new C16527e((Ctry) AbstractC12348e.f24769protected.get(c14077e.f27831e)), new Cprotected(AbstractC12442e.license(c14077e.f27832e)));
    }

    public static final void appmetrica(C13578e c13578e, InterfaceC5083e interfaceC5083e, boolean z) {
        Object obj = C13578e.f26924e.get(c13578e);
        Throwable purchase = c13578e.purchase(obj);
        Object c12763e = purchase != null ? new C12763e(purchase) : c13578e.yandex(obj);
        if (!z) {
            interfaceC5083e.billing(c12763e);
            return;
        }
        C3843e c3843e = (C3843e) interfaceC5083e;
        AbstractC10731e abstractC10731e = c3843e.f8480e;
        Object obj2 = c3843e.f8482e;
        InterfaceC8850e admob = abstractC10731e.admob();
        Object purchase2 = AbstractC2745e.purchase(admob, obj2);
        C13514e subscription = purchase2 != AbstractC2745e.vip ? AbstractC6494e.subscription(abstractC10731e, admob, purchase2) : null;
        try {
            c3843e.f8480e.billing(c12763e);
            Unit unit = Unit.INSTANCE;
            if (subscription == null || subscription.m3614e()) {
                AbstractC2745e.appmetrica(admob, purchase2);
            }
        } catch (Throwable th) {
            if (subscription == null || subscription.m3614e()) {
                AbstractC2745e.appmetrica(admob, purchase2);
            }
            throw th;
        }
    }

    public static boolean billing(Thread thread) {
        if (metrica == null) {
            metrica = Looper.getMainLooper().getThread();
        }
        return thread == metrica;
    }

    public static void license(String str, Bundle bundle) {
        try {
            C14679e.metrica();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = C16089e.m4110native(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC5632e interfaceC5632e = (InterfaceC5632e) C14679e.metrica().vip(InterfaceC5632e.class);
            if (interfaceC5632e != null) {
                ((C8638e) interfaceC5632e).ad("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void metrica(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0111e.metrica(android.content.Intent):void");
    }

    public static boolean purchase(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static boolean vip() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C14679e.metrica();
            C14679e metrica2 = C14679e.metrica();
            metrica2.ad();
            Context context = metrica2.ad;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static Handler yandex() {
        if (license == null) {
            synchronized (vip) {
                try {
                    if (license == null) {
                        license = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return license;
    }
}
