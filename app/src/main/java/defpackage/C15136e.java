package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۨۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15136e implements InterfaceC13021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C15136e f29932e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C1222e f29931e = C1222e.admob();

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        try {
            return C1222e.pro(inputStream);
        } catch (C11872e e) {
            throw new IOException("Cannot read proto.", e);
        }
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C1222e c1222e = (C1222e) obj;
        c1222e.getClass();
        int vip = c1222e.vip(null);
        Logger logger = AbstractC16754e.metrica;
        if (vip > 4096) {
            vip = 4096;
        }
        C7615e c7615e = new C7615e(outputStream, vip);
        c1222e.smaato(c7615e);
        if (c7615e.billing > 0) {
            c7615e.m2301this();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f29931e;
    }
}
