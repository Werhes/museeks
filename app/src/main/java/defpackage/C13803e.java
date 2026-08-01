package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13803e extends AbstractC12098e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final HashSet f27359e = new HashSet();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Iterator f27360e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C7460e f27361e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13803e(Iterator it, Function1 function1) {
        this.f27360e = it;
        this.f27361e = (C7460e) function1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eؚۛۖ, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC12098e
    public final void ad() {
        Object next;
        do {
            Iterator it = this.f27360e;
            if (!it.hasNext()) {
                this.f24255e = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f27359e.add(this.f27361e.invoke(next)));
        this.f24254e = next;
        this.f24255e = 1;
    }
}
