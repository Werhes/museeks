package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.net.ssl.HostnameVerifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16494e implements InterfaceC16294e {
    public static final C16494e ad = new Object();

    public static SharedPreferencesC3865e metrica(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        context.getApplicationContext().getApplicationContext();
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build();
        if (build == null) {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        Object obj = AbstractC14248e.ad;
        if (build.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + build.getKeySize() + " bits");
        }
        if (!Arrays.equals(build.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(build.getBlockModes()));
        }
        if (build.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + build.getPurposes());
        }
        if (!Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(build.getEncryptionPaddings()));
        }
        if (build.isUserAuthenticationRequired() && build.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (AbstractC14248e.ad) {
            String keystoreAlias = build.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(build);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        String keystoreAlias2 = build.getKeystoreAlias();
        AbstractC12717e.ad();
        AbstractC12112e.ad();
        Context applicationContext2 = applicationContext.getApplicationContext();
        C14461e c14461e = new C14461e();
        c14461e.f28591e = AbstractC18467e.ad("AES256_SIV");
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        c14461e.f28587e = applicationContext2;
        c14461e.f28589e = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        c14461e.f28586e = str;
        String Signature = AbstractC17861e.Signature("android-keystore://", keystoreAlias2);
        if (!Signature.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        c14461e.f28588e = Signature;
        C17424e m826volatile = c14461e.metrica().m826volatile();
        C14461e c14461e2 = new C14461e();
        c14461e2.f28591e = AbstractC18467e.ad("AES256_GCM");
        c14461e2.f28587e = applicationContext2;
        c14461e2.f28589e = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        c14461e2.f28586e = str;
        String Signature2 = AbstractC17861e.Signature("android-keystore://", keystoreAlias2);
        if (!Signature2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        c14461e2.f28588e = Signature2;
        C17424e m826volatile2 = c14461e2.metrica().m826volatile();
        return new SharedPreferencesC3865e(str, applicationContext2.getSharedPreferences(str, 0), (InterfaceC6830e) m826volatile2.crashlytics(InterfaceC6830e.class), (InterfaceC13627e) m826volatile.crashlytics(InterfaceC13627e.class));
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, eٍۣؐ] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC16294e
    public final void ad(Context context) {
        Object c12763e;
        InterfaceC9112e interfaceC9112e;
        C1343e c1343e = AbstractC12918e.ad;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
        C6351e ad2 = AbstractC12918e.ad.ad();
        ad2.startapp = false;
        ad2.adcel = false;
        C15601e c15601e = AbstractC12918e.metrica;
        C6741e c6741e = c15601e.purchase;
        if (!c6741e.equals(ad2.smaato)) {
            ad2.subs = null;
        }
        ad2.smaato = c6741e;
        C2691e c2691e = c15601e.billing;
        if (!c2691e.equals(ad2.amazon)) {
            ad2.subs = null;
        }
        ad2.amazon = c2691e;
        if (Build.VERSION.SDK_INT < 24) {
            try {
                c12763e = AbstractC3707e.ad(context);
            } catch (Throwable th) {
                c12763e = new C12763e(th);
            }
            if (c12763e instanceof C12763e) {
                c12763e = null;
            }
            interfaceC9112e = (C11280e) c12763e;
        } else {
            interfaceC9112e = null;
        }
        C15601e c15601e2 = AbstractC12918e.metrica;
        C11622e c11622e = c15601e2.ad.license;
        C7736e c7736e = new C7736e(0, c15601e2, C15601e.class, "isVkProxyEnabled", "isVkProxyEnabled()Z", 0, 0, 16);
        if (interfaceC9112e == null) {
            interfaceC9112e = new C16211e();
        }
        C4159e c4159e = new C4159e(c7736e, interfaceC9112e, c11622e);
        C4426e c4426e = c4159e.license;
        if (!c4426e.equals(ad2.Signature) || !c4159e.equals(ad2.admob)) {
            ad2.subs = null;
        }
        ad2.Signature = c4426e;
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        ad2.tapsense = AbstractC18303e.ad.metrica(c4159e);
        ad2.admob = c4159e;
        HostnameVerifier ad3 = c4159e.ad();
        if (!ad3.equals(ad2.pro)) {
            ad2.subs = null;
        }
        ad2.pro = ad3;
        int i = 1;
        ad2.metrica.add(new C9478e(C14914e.f29578e));
        int i2 = 3;
        ad2.metrica.add(new C8852e(i2));
        ad2.metrica.add(c15601e2.appmetrica);
        ad2.metrica.add(new C14179e(new C14136e(19)));
        AbstractC12918e.vip = new C1343e(ad2);
        C15420e c15420e = AbstractC6731e.ad;
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        InterfaceC5083e interfaceC5083e = null;
        int i3 = 2;
        AbstractC5336e.purchase(vKXApplication2, executorC3603e, 0, new C15734e(context, interfaceC5083e, i2), 2);
        AbstractC5336e.purchase(vKXApplication2, executorC3603e, 0, new C15734e(context, interfaceC5083e, 4), 2);
        VKXApplication vKXApplication3 = VKXApplication.f36528e;
        AbstractC5336e.purchase(vKXApplication3 != null ? vKXApplication3 : null, executorC3603e, 0, new C15734e(context, interfaceC5083e, i), 2);
        C1343e ad4 = AbstractC12918e.ad();
        String str = C10675e.f21023e;
        C10215e.purchase(context.getFilesDir());
        int i4 = 27;
        byte b = 0;
        VKXApplication.f36536e = new C8221e(ad4, new C6594e(i4, license(context.getApplicationContext(), "vk_api_preferences", true)), new C10524e(context, 0));
        VKXApplication vKXApplication4 = VKXApplication.f36528e;
        if (vKXApplication4 == null) {
            vKXApplication4 = null;
        }
        AbstractC5336e.purchase(vKXApplication4, executorC3603e, 0, new C8086e(context, new C8436e(b, 11), null, i), 2);
        C6594e c6594e = new C6594e(i4, license(context.getApplicationContext(), "spark_blobs", false));
        C7988e c7988e = new C7988e(context.getApplicationContext());
        VKXApplication vKXApplication5 = VKXApplication.f36528e;
        if (vKXApplication5 == null) {
            vKXApplication5 = null;
        }
        C9964e c9964e = new C9964e();
        C6056e c6056e = new C6056e((Function1) c9964e.f19685e, new C2163e(26), 1);
        c9964e.f19685e = c6056e;
        Unit unit = Unit.INSTANCE;
        ?? obj = new Object();
        obj.ad = new C4526e(i3);
        obj.metrica = 10;
        c6056e.invoke(obj);
        C14947e c14947e = new C14947e(obj);
        C9398e c9398e = new C9398e(c14947e, c9964e, true);
        ((InterfaceC10500e) c9398e.f18702e.mo397public(C4524e.f9798e)).mo692else(new C2109e(i2, c14947e));
        VKXApplication.f36532e = new C18046e(c7988e, vKXApplication5, c6594e, c9398e);
        SharedPreferences sharedPreferences = AbstractC16082e.appmetrica;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("user_token", null);
        if (string != null && string.length() != 0) {
            SharedPreferences sharedPreferences2 = AbstractC16082e.appmetrica;
            SharedPreferences sharedPreferences3 = sharedPreferences2 != null ? sharedPreferences2 : null;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = null;
            }
            if (sharedPreferences3.getLong("user_id_v2", sharedPreferences2.getInt("user_id", 0)) != 0) {
                C8221e c8221e = VKXApplication.f36536e;
                if (c8221e == null) {
                    c8221e = null;
                }
                C18479e c18479e = (C18479e) new C2163e(25).invoke((C18479e) c8221e.billing);
                AbstractC11906e.mopub((C6594e) c8221e.purchase, c18479e);
                c8221e.billing = c18479e;
                SharedPreferences sharedPreferences4 = AbstractC16082e.appmetrica;
                if (sharedPreferences4 == null) {
                    sharedPreferences4 = null;
                }
                SharedPreferences.Editor edit = sharedPreferences4.edit();
                edit.clear();
                edit.apply();
            }
        }
        VKXApplication vKXApplication6 = VKXApplication.f36528e;
        if (vKXApplication6 == null) {
            vKXApplication6 = null;
        }
        AbstractC5336e.purchase(vKXApplication6, executorC3603e, 0, new AbstractC7185e(2, null), 2);
    }

    public final SharedPreferences license(Context context, String str, boolean z) {
        C11999e c11999e = C11999e.ad;
        c11999e.getClass();
        C12309e c12309e = C11999e.purchase;
        InterfaceC8614e interfaceC8614e = C11999e.vip[8];
        if (((Boolean) c12309e.tapsense(c11999e)).booleanValue() && z) {
            AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "Skipping user prefs encryption due to failed Keystore implementation / forced", null);
            SharedPreferences sharedPreferences = AbstractC16082e.purchase;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            return null;
        }
        try {
            SharedPreferencesC3865e metrica = metrica(context, str);
            c11999e.metrica(false);
            return metrica;
        } catch (Exception e) {
            C11999e c11999e2 = C11999e.ad;
            c11999e2.getClass();
            C12309e c12309e2 = C11999e.billing;
            InterfaceC8614e interfaceC8614e2 = C11999e.vip[9];
            if (((Boolean) c12309e2.tapsense(c11999e2)).booleanValue()) {
                AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "Encryption forcefully disabled due to failed Keystore implementation", null);
                c11999e2.vip(true);
                SharedPreferences sharedPreferences2 = AbstractC16082e.purchase;
                if (sharedPreferences2 != null) {
                    return sharedPreferences2;
                }
                return null;
            }
            AbstractC14966e.ad(AbstractC11575e.vip(this), 6, AbstractC1786e.remoteconfig(e, new StringBuilder("Failed loading encrypted prefs, resetting... ")), null);
            try {
                c11999e2.metrica(true);
                vip(context, str);
                return metrica(context, str);
            } catch (Exception e2) {
                AbstractC14966e.ad(AbstractC11575e.vip(this), 6, AbstractC1786e.remoteconfig(e2, new StringBuilder("-> even after reset, this still fails: ")), null);
                e2.printStackTrace();
                C11999e c11999e3 = C11999e.ad;
                c11999e3.metrica(true);
                c11999e3.vip(true);
                SharedPreferences sharedPreferences3 = AbstractC16082e.purchase;
                return sharedPreferences3 != null ? sharedPreferences3 : null;
            }
        }
    }

    public final void vip(Context context, String str) {
        AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "-> clearing keystore master key", null);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry("_androidx_security_master_key_");
        AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "-> clearing saved encrypted data", null);
        context.getSharedPreferences(str, 0).edit().clear().apply();
    }
}
