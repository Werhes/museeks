package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11804e extends C7140e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ EnumC7437e f23680e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11804e(EnumC7437e enumC7437e, InterfaceC3314e interfaceC3314e) {
        super(0, AbstractC15389e.class, "switch", "Content$lambda$11$lambda$10$lambda$9$lambda$8$switch(Lua/itaysonlab/vkxreborn/toggles/types/BooleanToggle;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.f23680e = enumC7437e;
        this.f23681e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3314e interfaceC3314e = this.f23681e;
        interfaceC3314e.setValue(Boolean.valueOf(!((Boolean) interfaceC3314e.getValue()).booleanValue()));
        SharedPreferences sharedPreferences = AbstractC6181e.ad;
        Boolean bool = (Boolean) interfaceC3314e.getValue();
        boolean booleanValue = bool.booleanValue();
        SharedPreferences.Editor edit = AbstractC6181e.ad.edit();
        EnumC7437e enumC7437e = this.f23680e;
        edit.putBoolean(enumC7437e.name(), booleanValue).apply();
        AbstractC6181e.vip.put(enumC7437e, bool);
        return Unit.INSTANCE;
    }
}
