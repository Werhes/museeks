package defpackage;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC3865e implements SharedPreferences {
    public final SharedPreferences ad;
    public final InterfaceC13627e appmetrica;
    public final InterfaceC6830e license;
    public final String metrica;
    public final CopyOnWriteArrayList vip = new CopyOnWriteArrayList();

    public SharedPreferencesC3865e(String str, SharedPreferences sharedPreferences, InterfaceC6830e interfaceC6830e, InterfaceC13627e interfaceC13627e) {
        this.metrica = str;
        this.ad = sharedPreferences;
        this.license = interfaceC6830e;
        this.appmetrica = interfaceC13627e;
    }

    public static boolean metrica(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String ad(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return AbstractC15530e.vip(this.appmetrica.ad(str.getBytes(StandardCharsets.UTF_8), this.metrica.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (metrica(str)) {
            throw new SecurityException(AbstractC10257e.adcel(str, " is a reserved key for the encryption keyset."));
        }
        return this.ad.contains(ad(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC3185e(this, this.ad.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.ad.getAll().entrySet()) {
            if (!metrica(entry.getKey())) {
                try {
                    String str = new String(this.appmetrica.vip(AbstractC15530e.ad(entry.getKey()), this.metrica.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, vip(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object vip = vip(str);
        return vip instanceof Boolean ? ((Boolean) vip).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object vip = vip(str);
        return vip instanceof Float ? ((Float) vip).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object vip = vip(str);
        return vip instanceof Integer ? ((Integer) vip).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object vip = vip(str);
        return vip instanceof Long ? ((Long) vip).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object vip = vip(str);
        return vip instanceof String ? (String) vip : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object vip = vip(str);
        Set c17548e = vip instanceof Set ? (Set) vip : new C17548e(0);
        return c17548e.size() > 0 ? c17548e : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.vip.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.vip.remove(onSharedPreferenceChangeListener);
    }

    public final Object vip(String str) {
        String str2;
        if (metrica(str)) {
            throw new SecurityException(AbstractC10257e.adcel(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String ad = ad(str);
            String string = this.ad.getString(ad, null);
            if (string != null) {
                byte[] ad2 = AbstractC15530e.ad(string);
                InterfaceC6830e interfaceC6830e = this.license;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(interfaceC6830e.vip(ad2, ad.getBytes(charset)));
                wrap.position(0);
                int i = wrap.getInt();
                int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
                if (i2 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
                int m2467class = AbstractC8703e.m2467class(i2);
                if (m2467class == 0) {
                    int i3 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i3);
                    String charBuffer = charset.decode(slice).toString();
                    if (!charBuffer.equals("__NULL__")) {
                        return charBuffer;
                    }
                } else {
                    if (m2467class != 1) {
                        if (m2467class == 2) {
                            return Integer.valueOf(wrap.getInt());
                        }
                        if (m2467class == 3) {
                            return Long.valueOf(wrap.getLong());
                        }
                        if (m2467class == 4) {
                            return Float.valueOf(wrap.getFloat());
                        }
                        if (m2467class == 5) {
                            return Boolean.valueOf(wrap.get() != 0);
                        }
                        switch (i2) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    C17548e c17548e = new C17548e(0);
                    while (wrap.hasRemaining()) {
                        int i4 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i4);
                        wrap.position(wrap.position() + i4);
                        c17548e.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (c17548e.f34401e != 1 || !"__NULL__".equals(c17548e.f34402e[0])) {
                        return c17548e;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }
}
