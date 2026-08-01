package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8950e implements Iterable, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f17965e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17966e;

    public /* synthetic */ C8950e(int i, Object obj) {
        this.f17966e = i;
        this.f17965e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f17966e) {
            case 0:
                return new C1630e(1, (Object[]) this.f17965e);
            case 1:
                return new C2320e((Iterator) ((Function0) this.f17965e).invoke());
            case 2:
                return ((InterfaceC9093e) this.f17965e).iterator();
            default:
                return new C1630e((C2511e) this.f17965e);
        }
    }
}
