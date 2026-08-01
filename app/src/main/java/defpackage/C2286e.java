package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2286e extends AbstractC16640e {
    public final Field ad;
    public final Field metrica;
    public final Field vip;

    public C2286e(Field field, Field field2, Field field3) {
        this.ad = field;
        this.vip = field2;
        this.metrica = field3;
    }

    @Override // defpackage.AbstractC16640e
    public final boolean ad(InputMethodManager inputMethodManager) {
        try {
            this.metrica.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC16640e
    public final View metrica(InputMethodManager inputMethodManager) {
        try {
            return (View) this.vip.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC16640e
    public final Object vip(InputMethodManager inputMethodManager) {
        try {
            return this.ad.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }
}
