package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Collection f4802e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f4803e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f4804e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ List f4805e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f4806e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f4807e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Iterator f4808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767e(List list, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4805e = list;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C1767e(this.f4805e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1767e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0058 -> B:5:0x005b). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f4803e
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 != r1) goto L17
            int r0 = r10.f4806e
            int r2 = r10.f4804e
            java.lang.Object r3 = r10.f4807e
            java.util.Iterator r4 = r10.f4808e
            java.util.Collection r5 = r10.f4802e
            java.util.Collection r5 = (java.util.Collection) r5
            defpackage.AbstractC2003e.purchase(r11)
            goto L5b
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            defpackage.AbstractC2003e.purchase(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r0 = r10.f4805e
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r5 = r11
            r4 = r0
            r0 = r2
        L31:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L6b
            java.lang.Object r3 = r4.next()
            r11 = r3
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r11 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r11
            eِ٘ؐ r6 = defpackage.C11794e.f23667e
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            r10.f4802e = r7
            r10.f4808e = r4
            r10.f4807e = r3
            r10.f4804e = r2
            r10.f4806e = r0
            r10.f4803e = r1
            r6.getClass()
            java.lang.Object r11 = defpackage.C11794e.metrica(r11, r10)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r11 != r6) goto L5b
            return r6
        L5b:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L31
            r5.add(r3)
            goto L31
        L6b:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r11 = r5.iterator()
        L71:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r11.next()
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r0 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r0
            eِ٘ؐ r1 = defpackage.C11794e.f23667e
            r1.billing(r0)
            goto L71
        L83:
            int r11 = r5.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1767e.loadAd(java.lang.Object):java.lang.Object");
    }
}
