package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Drawable f5857e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f5858e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f5859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343e(Drawable drawable, Function0 function0, Function0 function02, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f5857e = drawable;
        this.f5859e = function0;
        this.f5858e = function02;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C2343e(this.f5857e, this.f5859e, this.f5858e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2343e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        ((AnimatedImageDrawable) this.f5857e).registerAnimationCallback(new C6608e(this.f5859e, this.f5858e));
        return Unit.INSTANCE;
    }
}
