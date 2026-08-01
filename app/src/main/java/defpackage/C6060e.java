package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6060e implements InterfaceC18315e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Range f12738e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Range f12739e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashSet f12740e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC18315e f12741e;

    public C6060e(InterfaceC18315e interfaceC18315e) {
        this.f12741e = interfaceC18315e;
        HashSet hashSet = new HashSet();
        this.f12740e = hashSet;
        int mo382e = interfaceC18315e.mo382e();
        this.f12739e = Range.create(Integer.valueOf(mo382e), Integer.valueOf(((int) Math.ceil(4096.0d / mo382e)) * mo382e));
        int mo387e = interfaceC18315e.mo387e();
        this.f12738e = Range.create(Integer.valueOf(mo387e), Integer.valueOf(((int) Math.ceil(2160.0d / mo387e)) * mo387e));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.ad.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٜؑ٘ */
    public final boolean mo379e(int i, int i2) {
        InterfaceC18315e interfaceC18315e = this.f12741e;
        if (interfaceC18315e.mo379e(i, i2)) {
            return true;
        }
        HashSet hashSet = this.f12740e;
        if (hashSet == null || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return true;
                }
            }
        }
        return this.f12739e.contains((Range) Integer.valueOf(i)) && this.f12738e.contains((Range) Integer.valueOf(i2)) && i % interfaceC18315e.mo382e() == 0 && i2 % interfaceC18315e.mo387e() == 0;
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؑۧٝ */
    public final Range mo380e(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.f12739e;
        boolean contains = range.contains((Range) valueOf);
        InterfaceC18315e interfaceC18315e = this.f12741e;
        if (contains && i % interfaceC18315e.mo382e() == 0) {
            return this.f12738e;
        }
        throw new IllegalArgumentException(("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC18315e.mo382e()).toString());
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eَُؗ */
    public final Range mo381e(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.f12738e;
        boolean contains = range.contains((Range) valueOf);
        InterfaceC18315e interfaceC18315e = this.f12741e;
        if (contains && i % interfaceC18315e.mo387e() == 0) {
            return this.f12739e;
        }
        throw new IllegalArgumentException(("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC18315e.mo387e()).toString());
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؘِۢ */
    public final int mo382e() {
        return this.f12741e.mo382e();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٍ٘ۛ */
    public final Range mo383e() {
        return this.f12738e;
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؘُٗ */
    public final Range mo384e() {
        return this.f12741e.mo384e();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eِْ۠ */
    public final boolean mo385e() {
        return this.f12741e.mo385e();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eّ۟ٝ */
    public final boolean mo386e(int i, int i2) {
        if (mo379e(i, i2)) {
            return true;
        }
        return mo385e() && mo379e(i2, i);
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٓؒؔ */
    public final int mo387e() {
        return this.f12741e.mo387e();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eَۣ٘ */
    public final Range mo388e() {
        return this.f12739e;
    }
}
