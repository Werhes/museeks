package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4660e implements InterfaceC15967e {
    public static final C4660e metrica = new C4660e(Collections.EMPTY_MAP);
    public int ad;
    public final Map vip;

    public C4660e(Map map) {
        this.vip = DesugarCollections.unmodifiableMap(map);
    }

    public static boolean vip(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final C4660e ad(C18540e c18540e) {
        byte[] bArr;
        Map map = this.vip;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList((ArrayList) c18540e.f36382e));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap((HashMap) c18540e.f36383e);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        return vip(map, hashMap) ? this : new C4660e(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4660e.class != obj.getClass()) {
            return false;
        }
        return vip(this.vip, ((C4660e) obj).vip);
    }

    public final int hashCode() {
        if (this.ad == 0) {
            int i = 0;
            for (Map.Entry entry : this.vip.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.ad = i;
        }
        return this.ad;
    }
}
