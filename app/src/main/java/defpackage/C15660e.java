package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15660e implements InterfaceC11801e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30865e;

    @Override // defpackage.InterfaceC11801e
    public final boolean apply(Object obj) {
        switch (this.f30865e) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            default:
                return true;
        }
    }
}
