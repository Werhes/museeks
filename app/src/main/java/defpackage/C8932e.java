package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8932e implements Iterable, InterfaceC16555e {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        try {
            return Arrays.asList(new InterfaceC3699e[0]).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
