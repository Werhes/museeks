package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12014e extends AbstractC8715e {
    public final /* synthetic */ Function0 metrica;
    public final /* synthetic */ Function0 vip;

    public C12014e(Function0 function0, Function0 function02) {
        this.vip = function0;
        this.metrica = function02;
    }

    @Override // defpackage.AbstractC8715e
    public final void ad(Drawable drawable) {
        Function0 function0 = this.metrica;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.AbstractC8715e
    public final void vip(Drawable drawable) {
        Function0 function0 = this.vip;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
