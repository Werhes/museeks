package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5577e {
    public final String ad;
    public boolean appmetrica;
    public boolean license;
    public boolean purchase;
    public final InterfaceC11962e vip;
    public String metrica = "5.272";
    public final LinkedHashMap billing = new LinkedHashMap();

    public C5577e(String str, InterfaceC11962e interfaceC11962e) {
        this.ad = str;
        this.vip = interfaceC11962e;
    }

    public final Unit ad(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        this.billing.put(str, str2);
        return Unit.INSTANCE;
    }

    public final void license(String str, boolean z) {
        ad(str, z ? "1" : "0");
    }

    public final void metrica(long j, String str) {
        ad(str, String.valueOf(j));
    }

    public final void vip(int i, String str) {
        ad(str, String.valueOf(i));
    }
}
