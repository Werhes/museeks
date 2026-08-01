package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7130e extends AbstractC6439e {
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7130e(InterfaceC9998e interfaceC9998e, int i) {
        super(interfaceC9998e);
        this.vip = i;
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        switch (this.vip) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
