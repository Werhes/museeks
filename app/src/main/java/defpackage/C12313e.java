package defpackage;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12313e implements InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C12313e f24698e = new Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [eٍُۧ, java.lang.Object] */
    public final C13391e ad(InterfaceC4895e interfaceC4895e) {
        InputStream mo1680e = interfaceC4895e.mo1680e();
        ?? obj = new Object();
        obj.ad = null;
        obj.vip = null;
        obj.metrica = false;
        obj.appmetrica = false;
        obj.purchase = null;
        obj.billing = null;
        obj.yandex = false;
        obj.startapp = null;
        if (!mo1680e.markSupported()) {
            mo1680e = new BufferedInputStream(mo1680e);
        }
        try {
            mo1680e.mark(3);
            int read = mo1680e.read() + (mo1680e.read() << 8);
            mo1680e.reset();
            if (read == 35615) {
                mo1680e = new BufferedInputStream(new GZIPInputStream(mo1680e));
            }
        } catch (IOException unused) {
        }
        try {
            mo1680e.mark(4096);
            obj.premium(mo1680e);
            return new C13391e(obj.ad);
        } finally {
            try {
                mo1680e.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C12313e) && (obj instanceof InterfaceC10212e)) {
            return vip().equals(((InterfaceC10212e) obj).vip());
        }
        return false;
    }

    public final int hashCode() {
        return vip().hashCode();
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return new C7460e(1, AbstractC17190e.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }
}
