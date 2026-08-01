package defpackage;

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18520e {
    public static final C18520e vip = new C18520e(new HashMap());
    public final Map ad;

    public C18520e(HashMap hashMap) {
        this.ad = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static C16089e ad(MediaFormat mediaFormat, Set set) {
        C16089e c16089e = new C16089e(5);
        HashMap hashMap = (HashMap) c16089e.f31681e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    hashMap.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    hashMap.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    hashMap.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    hashMap.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        hashMap.put(str, null);
                    } else {
                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                        allocate.put(byteBuffer.duplicate());
                        allocate.flip();
                        hashMap.put(str, allocate);
                    }
                }
            }
        }
        return c16089e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18520e) {
            return this.ad.equals(((C18520e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
