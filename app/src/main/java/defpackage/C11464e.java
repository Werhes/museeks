package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِٟؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11464e<T> {
    public static final C6115e Companion = new Object();
    public final Object ad;
    public final C2813e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؑٔ, java.lang.Object] */
    static {
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse", null, 2);
        c4707e.advert("response", true);
        c4707e.advert("error", true);
    }

    public /* synthetic */ C11464e(int i, Object obj, C2813e c2813e) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = obj;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = c2813e;
        }
    }

    public C11464e(Object obj) {
        this.ad = obj;
        this.vip = null;
    }
}
