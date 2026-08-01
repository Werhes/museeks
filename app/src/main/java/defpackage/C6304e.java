package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6304e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C6304e c6304e = EnumC8488e.f17274e;
        if (i == 0) {
            return EnumC8488e.Verbose;
        }
        if (i == 1) {
            return EnumC8488e.Debug;
        }
        if (i == 2) {
            return EnumC8488e.Info;
        }
        if (i == 3) {
            return EnumC8488e.Warning;
        }
        if (i != 4) {
            return null;
        }
        return EnumC8488e.Error;
    }
}
