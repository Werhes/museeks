package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9445e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C10689e f18786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9445e(C10689e c10689e) {
        super(1, AbstractC15389e.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f18786e = c10689e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((C6739e) obj).ad;
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.f18786e.f21052e.getValue();
        if (interfaceC0043e != null) {
            if (!interfaceC0043e.billing()) {
                interfaceC0043e = null;
            }
            if (interfaceC0043e != null) {
                interfaceC0043e.startapp(fArr);
            }
        }
        return Unit.INSTANCE;
    }
}
