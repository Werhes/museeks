package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6273e extends AbstractC9049e {
    public AbstractC6273e(InterfaceC5083e interfaceC5083e) {
        super(interfaceC5083e);
        if (interfaceC5083e != null && interfaceC5083e.admob() != C2693e.f6576e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return C2693e.f6576e;
    }
}
