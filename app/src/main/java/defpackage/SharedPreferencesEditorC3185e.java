package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesEditorC3185e implements SharedPreferences.Editor {
    public final SharedPreferencesC3865e ad;
    public final AtomicBoolean license = new AtomicBoolean(false);
    public final CopyOnWriteArrayList metrica = new CopyOnWriteArrayList();
    public final SharedPreferences.Editor vip;

    public SharedPreferencesEditorC3185e(SharedPreferencesC3865e sharedPreferencesC3865e, SharedPreferences.Editor editor) {
        this.ad = sharedPreferencesC3865e;
        this.vip = editor;
    }

    public final void ad() {
        if (this.license.getAndSet(false)) {
            SharedPreferencesC3865e sharedPreferencesC3865e = this.ad;
            for (String str : ((HashMap) sharedPreferencesC3865e.getAll()).keySet()) {
                if (!this.metrica.contains(str) && !SharedPreferencesC3865e.metrica(str)) {
                    this.vip.remove(sharedPreferencesC3865e.ad(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        ad();
        this.vip.apply();
        vip();
        this.metrica.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.license.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.metrica;
        ad();
        try {
            return this.vip.commit();
        } finally {
            vip();
            copyOnWriteArrayList.clear();
        }
    }

    public final void metrica(String str, byte[] bArr) {
        SharedPreferencesC3865e sharedPreferencesC3865e = this.ad;
        sharedPreferencesC3865e.getClass();
        if (SharedPreferencesC3865e.metrica(str)) {
            throw new SecurityException(AbstractC10257e.adcel(str, " is a reserved key for the encryption keyset."));
        }
        this.metrica.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String ad = sharedPreferencesC3865e.ad(str);
            Pair pair = new Pair(ad, AbstractC15530e.vip(sharedPreferencesC3865e.license.ad(bArr, ad.getBytes(StandardCharsets.UTF_8))));
            this.vip.putString((String) pair.first, (String) pair.second);
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z ? (byte) 1 : (byte) 0);
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i);
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C17548e(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        metrica(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC3865e sharedPreferencesC3865e = this.ad;
        sharedPreferencesC3865e.getClass();
        if (SharedPreferencesC3865e.metrica(str)) {
            throw new SecurityException(AbstractC10257e.adcel(str, " is a reserved key for the encryption keyset."));
        }
        this.vip.remove(sharedPreferencesC3865e.ad(str));
        this.metrica.add(str);
        return this;
    }

    public final void vip() {
        SharedPreferencesC3865e sharedPreferencesC3865e = this.ad;
        Iterator it = sharedPreferencesC3865e.vip.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.metrica.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC3865e, (String) it2.next());
            }
        }
    }
}
