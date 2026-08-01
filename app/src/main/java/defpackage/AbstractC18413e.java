package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18413e {
    public static final C11980e ad = new C11980e(6);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            while (it.hasNext()) {
                ((C13808e) it.next()).getClass();
                C5363e c5363e = AbstractC10700e.ad;
                C11980e c11980e = ad;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c11980e.f23950e;
                if (linkedHashMap.containsKey(100)) {
                    throw new IllegalArgumentException("Provider with priority 100 already registered. Every registered provider should have unique priority.");
                }
                if (((C5363e) c11980e.f23949e).ad()) {
                    throw new IllegalStateException("Cannot register provider after `getRegisteredProviders` was called");
                }
                linkedHashMap.put(100, c5363e);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
