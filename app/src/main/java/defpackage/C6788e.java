package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6788e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C9820e f13992e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6788e(C9820e c9820e, int i) {
        super(0);
        this.f13993e = i;
        this.f13992e = c9820e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C15087e snapshotObserver;
        switch (this.f13993e) {
            case 0:
                this.f13992e.getLayoutNode().firebase();
                return Unit.INSTANCE;
            case 1:
                C9820e c9820e = this.f13992e;
                if (c9820e.f19636e && c9820e.isAttachedToWindow() && c9820e.getView().getParent() == c9820e) {
                    snapshotObserver = c9820e.getSnapshotObserver();
                    snapshotObserver.ad.metrica(c9820e, C5430e.f11632e, c9820e.getUpdate());
                }
                return Unit.INSTANCE;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f13992e.f19379e.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                C9820e c9820e2 = this.f13992e;
                c9820e2.getReleaseBlock().invoke(c9820e2.f19379e);
                C9820e.amazon(c9820e2);
                return Unit.INSTANCE;
            case 4:
                C9820e c9820e3 = this.f13992e;
                c9820e3.getResetBlock().invoke(c9820e3.f19379e);
                return Unit.INSTANCE;
            default:
                C9820e c9820e4 = this.f13992e;
                c9820e4.getUpdateBlock().invoke(c9820e4.f19379e);
                return Unit.INSTANCE;
        }
    }
}
