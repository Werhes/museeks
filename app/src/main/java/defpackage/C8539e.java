package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8539e extends AbstractRunnableC9465e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13578e f17339e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0541e f17340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8539e(AbstractC0541e abstractC0541e, long j, C13578e c13578e) {
        super(j);
        this.f17340e = abstractC0541e;
        this.f17339e = c13578e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17339e.m3618goto(this.f17340e, Unit.INSTANCE);
    }

    @Override // defpackage.AbstractRunnableC9465e
    public final String toString() {
        return super.toString() + this.f17339e;
    }
}
