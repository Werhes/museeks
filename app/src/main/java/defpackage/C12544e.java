package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12544e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater vip = AtomicIntegerFieldUpdater.newUpdater(C12544e.class, "notCompletedCount$volatile");
    public final InterfaceC1908e[] ad;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C12544e(InterfaceC1908e[] interfaceC1908eArr) {
        this.ad = interfaceC1908eArr;
        this.notCompletedCount$volatile = interfaceC1908eArr.length;
    }
}
