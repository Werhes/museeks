package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4730e implements InterfaceC14706e {
    public final LocaleList ad;

    public C4730e(Object obj) {
        this.ad = (LocaleList) obj;
    }

    @Override // defpackage.InterfaceC14706e
    public final String ad() {
        return this.ad.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.ad.equals(((InterfaceC14706e) obj).vip());
    }

    @Override // defpackage.InterfaceC14706e
    public final Locale get(int i) {
        return this.ad.get(i);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC14706e
    public final boolean isEmpty() {
        return this.ad.isEmpty();
    }

    @Override // defpackage.InterfaceC14706e
    public final int size() {
        return this.ad.size();
    }

    public final String toString() {
        return this.ad.toString();
    }

    @Override // defpackage.InterfaceC14706e
    public final Object vip() {
        return this.ad;
    }
}
