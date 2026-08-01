package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16464e extends AbstractC16858e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5039e f32288e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f32289e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f32290e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5830e f32291e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ View f32292e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f32293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16464e(Context context, Function1 function1, C14725e c14725e, InterfaceC5039e interfaceC5039e, int i, View view) {
        super(0);
        this.f32290e = context;
        this.f32289e = function1;
        this.f32291e = c14725e;
        this.f32288e = interfaceC5039e;
        this.f32293e = i;
        this.f32292e = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C9820e(this.f32290e, this.f32289e, this.f32291e, this.f32288e, this.f32293e, (InterfaceC16590e) this.f32292e).getLayoutNode();
    }
}
