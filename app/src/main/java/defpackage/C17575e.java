package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17575e {
    public static final C4685e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C1349e(1))};
    public final EnumC6024e ad;

    public /* synthetic */ C17575e(int i, EnumC6024e enumC6024e) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = enumC6024e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17575e) && this.ad == ((C17575e) obj).ad;
    }

    public final int hashCode() {
        EnumC6024e enumC6024e = this.ad;
        if (enumC6024e == null) {
            return 0;
        }
        return enumC6024e.hashCode();
    }

    public final String toString() {
        return "AudioPlaylistMetaDto(view=" + this.ad + ")";
    }
}
