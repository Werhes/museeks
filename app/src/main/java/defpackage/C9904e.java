package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۦٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9904e implements InterfaceC15374e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC2141e f19531e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f19532e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f19533e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C15024e f19534e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1839e f19535e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final CharSequence f19536e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f19537e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final List f19538e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5386e f19539e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f19540e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C2687e f19541e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC14388e f19542e;

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0388, code lost:
    
        if ((r5.vip.metrica & 1095216660480L) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0099, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0847 A[LOOP:5: B:290:0x0845->B:291:0x0847, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    /* JADX WARN: Type inference failed for: r4v3, types: [eّؔٚ, android.text.TextPaint, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9904e(java.lang.String r41, defpackage.C1839e r42, java.util.List r43, java.util.List r44, defpackage.InterfaceC2141e r45, defpackage.InterfaceC14388e r46) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9904e.<init>(java.lang.String, eٕؓۧ, java.util.List, java.util.List, eؓ۠٘, eٓۦۣ):void");
    }

    @Override // defpackage.InterfaceC15374e
    /* renamed from: extends, reason: not valid java name */
    public final float mo2750extends() {
        return this.f19539e.metrica();
    }

    @Override // defpackage.InterfaceC15374e
    public final boolean vip() {
        C15024e c15024e = this.f19534e;
        if (c15024e != null ? c15024e.inmobi() : false) {
            return true;
        }
        if (!this.f19537e && AbstractC13510e.ad(this.f19535e)) {
            C17974e c17974e = C1947e.ad;
            C17974e c17974e2 = C1947e.ad;
            InterfaceC16132e interfaceC16132e = (InterfaceC16132e) c17974e2.f35233e;
            if (interfaceC16132e == null) {
                if (C5188e.license()) {
                    interfaceC16132e = c17974e2.Signature();
                    c17974e2.f35233e = interfaceC16132e;
                } else {
                    interfaceC16132e = AbstractC7291e.ad;
                }
            }
            if (((Boolean) interfaceC16132e.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC15374e
    public final float yandex() {
        float f;
        C5386e c5386e = this.f19539e;
        float f2 = c5386e.appmetrica;
        TextPaint textPaint = c5386e.vip;
        if (!Float.isNaN(f2)) {
            return c5386e.appmetrica;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c5386e.ad;
        lineInstance.setText(new C18452e(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC4508e.ad);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C11241e(i, next, 1));
            } else {
                C15926e c15926e = (C15926e) priorityQueue.peek();
                if (c15926e != null && c15926e.f22522e - c15926e.f22523e < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C11241e(i, next, 1));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C15926e c15926e2 = (C15926e) it.next();
            float desiredWidth = Layout.getDesiredWidth(c5386e.vip(), c15926e2.f22523e, c15926e2.f22522e, textPaint);
            while (it.hasNext()) {
                C15926e c15926e3 = (C15926e) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c5386e.vip(), c15926e3.f22523e, c15926e3.f22522e, textPaint));
            }
            f = desiredWidth;
        }
        c5386e.appmetrica = f;
        return f;
    }
}
