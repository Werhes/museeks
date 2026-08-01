package defpackage;

/* renamed from: eۣؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2956e extends Cfinal {
    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2332case(z, 49, this.f36388e);
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        int i = z ? 4 : 3;
        for (subs subsVar : this.f36388e) {
            i += subsVar.billing().remoteconfig(true);
        }
        return i;
    }
}
