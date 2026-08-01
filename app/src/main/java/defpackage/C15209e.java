package defpackage;

import android.database.Observable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15209e extends Observable {
    public final boolean ad() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void appmetrica(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).metrica(i, i2);
        }
    }

    public final void billing() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).purchase();
        }
    }

    public final void license(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).vip(i, i2, obj);
        }
    }

    public final void metrica(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).license(i, i2);
        }
    }

    public final void purchase(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).appmetrica(i, i2);
        }
    }

    public final void vip() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC10072e) ((Observable) this).mObservers.get(size)).ad();
        }
    }
}
