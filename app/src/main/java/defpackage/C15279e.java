package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15279e extends AbstractC3881e implements InterfaceC11391e {
    public final InterfaceC10625e amazon;

    public C15279e(InterfaceC10625e interfaceC10625e) {
        super(new C13396e[2], new C0598e[2]);
        int i = this.billing;
        C7507e[] c7507eArr = this.appmetrica;
        AbstractC2301e.subscription(i == c7507eArr.length);
        for (C7507e c7507e : c7507eArr) {
            c7507e.admob(1024);
        }
        this.amazon = interfaceC10625e;
    }

    @Override // defpackage.AbstractC3881e
    public final AbstractC11254e billing() {
        return new C0598e(this);
    }

    @Override // defpackage.AbstractC3881e
    public final C7507e purchase() {
        return new C7507e(1);
    }

    @Override // defpackage.AbstractC3881e
    public final AbstractC1762e startapp(C7507e c7507e, AbstractC11254e abstractC11254e, boolean z) {
        C13396e c13396e = (C13396e) c7507e;
        C0598e c0598e = (C0598e) abstractC11254e;
        try {
            ByteBuffer byteBuffer = c13396e.f15296e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            InterfaceC10625e interfaceC10625e = this.amazon;
            if (z) {
                interfaceC10625e.reset();
            }
            InterfaceC11455e mo823this = interfaceC10625e.mo823this(0, limit, array);
            long j = c13396e.f15301e;
            long j2 = c13396e.f26649e;
            c0598e.f22622e = j;
            c0598e.f2809e = mo823this;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            c0598e.f2812e = j;
            c0598e.f22623e = false;
            return null;
        } catch (C16762e e) {
            return e;
        }
    }

    @Override // defpackage.InterfaceC11391e
    public final void vip(long j) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception, eِؓۜ] */
    @Override // defpackage.AbstractC3881e
    public final AbstractC1762e yandex(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }
}
