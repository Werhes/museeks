package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17246e implements InterfaceC17242e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Function1 appmetrica;
    public final /* synthetic */ Map license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C17246e(int i, int i2, Map map, Function1 function1, int i3) {
        this.ad = i3;
        this.vip = i;
        this.metrica = i2;
        this.license = map;
        this.appmetrica = function1;
    }

    private final void appmetrica() {
    }

    private final void purchase() {
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        switch (this.ad) {
            case 0:
                return this.license;
            default:
                return this.license;
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        switch (this.ad) {
            case 0:
                return this.vip;
            default:
                return this.vip;
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        switch (this.ad) {
            case 0:
                return this.appmetrica;
            default:
                return this.appmetrica;
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        int i = this.ad;
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        switch (this.ad) {
            case 0:
                return this.metrica;
            default:
                return this.metrica;
        }
    }
}
