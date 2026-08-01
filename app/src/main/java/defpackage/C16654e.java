package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۦۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16654e extends Editable.Factory {
    public static final Object ad = new Object();
    public static Class metrica;
    public static volatile C16654e vip;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = metrica;
        return cls != null ? new C7427e(cls, charSequence) : super.newEditable(charSequence);
    }
}
